package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(12)));
        System.out.println(Arrays.toString(sieve(25)));
        System.out.println(Arrays.toString(sieve(67)));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = new int[maximumNumber - 1];
        for (int i = 0; i < (maximumNumber - 1); i++) {
            array[i] = i + 2;
        }
        int[] sievedArray = new int[howManyPrimes(array)];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j = j + array[i]) {
                if (array[i] == 0) {
                    break;
                }
                if (j == i) {
                    continue;
                }
                array[j] = 0;
            }
        }
        for (int i = 0; i < sievedArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 0) {
                    continue;
                }
                sievedArray[i] = array[j];
                array[j] = 0;
                break;
            }
        }
        return sievedArray;
    }

    private static int howManyPrimes(int array[]) {
        int numberOfPrimesInArray = array.length;
        int count = 0;
        for (int i = array[array.length - 1]; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    numberOfPrimesInArray--;
                    break;
                }
            }
            count = 0;
        }
        return numberOfPrimesInArray;
    }
}

