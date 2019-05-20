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
        markMultiples(array);
        int[] primes = new int[countPrimes(array)];
        filterMultiples(array, primes);
        return primes;
    }

    private static int countPrimes(int[] array) {
        int numberOfPrimes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != MULTIPLE_MARKER) {
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
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
            if (numbers[i] == MULTIPLE_MARKER) {
                continue;
            }
            for (int j = i + numbers[i]; j < numbers.length; j = j + numbers[i]) {
                numbers[j] = MULTIPLE_MARKER;
            }
        }
    }

    private static void filterMultiples(int[] filterFrom, int[] filterTo) {
        for (int i = 0, j = 0; j < filterFrom.length; j++) {
            if (filterFrom[j] == MULTIPLE_MARKER) {
                continue;
            }
            filterTo[i++] = filterFrom[j];
            filterFrom[j] = MULTIPLE_MARKER;
        }
    }
}

