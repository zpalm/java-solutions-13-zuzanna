package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array1 = {4, 7, 5, 3, 6, 1, 2};
        System.out.println(Arrays.toString(sort(array1)));
        int[] array2 = {0, 53, 61, 3, 9, 22, 17};
        System.out.println(Arrays.toString(sort(array2)));
        int[] array3 = {5, -33, 67, 329, -44, 0, -59};
        System.out.println(Arrays.toString(sort(array3)));
    }

    public static int[] sort(int[] array) {
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

    private static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
