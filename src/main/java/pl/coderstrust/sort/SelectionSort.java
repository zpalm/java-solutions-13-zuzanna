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
        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        for (int i = 0; i < (sorted.length - 1); i++) {
            int min = i;
            for (int j = (i + 1); j < sorted.length; j++) {
                if (sorted[min] > sorted[j]) {
                    min = j;
                }
            }
            int temp = sorted[i];
            sorted[i] = sorted[min];
            sorted[min] = temp;
        }
        return sorted;
    }
}
