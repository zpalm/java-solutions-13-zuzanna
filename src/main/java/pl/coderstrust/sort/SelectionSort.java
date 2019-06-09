package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort implements SortingMethod {

    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < (sortedArray.length - 1); i++) {
            int min = i;
            for (int j = (i + 1); j < sortedArray.length; j++) {
                if (sortedArray[min] > sortedArray[j]) {
                    min = j;
                }
            }
            swap(sortedArray, i, min);
        }
        return sortedArray;
    }

    private void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
