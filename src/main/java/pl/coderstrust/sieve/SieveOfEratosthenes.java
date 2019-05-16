package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {

    private static final int MULTIPLE_MARKER = 0;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(12)));
        System.out.println(Arrays.toString(sieve(25)));
        System.out.println(Arrays.toString(sieve(67)));
    }

    public static int[] sieve(int maximumNumber) {
        int[] array = createArrayOfNumbers(2, maximumNumber);
        int[] primes = new int[countPrimes(array)];
        markMultiples(array);
        filterMultiples(array, primes);
        return primes;
    }

    private static int countPrimes(int array[]) {
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

    private static int[] createArrayOfNumbers(int from, int to) {
        int[] array = new int[to - from + 1];
        for (int i = 0; i < (to - 1); i++) {
            array[i] = from;
            from++;
        }
        return array;
    }

    private static void markMultiples(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j = j + numbers[i]) {
                if (numbers[i] == MULTIPLE_MARKER) {
                    break;
                }
                if (j == i) {
                    continue;
                }
                numbers[j] = MULTIPLE_MARKER;
            }
        }
    }

    private static void filterMultiples(int[] filterFrom, int[] filterTo) {
        int index = 0;
        for (int j = 0; j < filterFrom.length; j++) {
            if (filterFrom[j] == MULTIPLE_MARKER) {
                continue;
            }
            filterTo[index] = filterFrom[j];
            filterFrom[j] = MULTIPLE_MARKER;
            index++;
        }
    }
}

