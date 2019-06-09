package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort implements SortingMethod {

    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean sorted;
        for (int i = 0; i < (sortedArray.length - 1); i++) {
            sorted = false;
            for (int j = 0; j < (sortedArray.length - 1); j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    swap(sortedArray, j, j + 1);
                    sorted = true;
                }
            }
            if (sorted == false) {
                break;
            }
        }
        return sortedArray;
    }

    private static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
