package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array1 = {6, 4, 2, 7, 5, 1, 3};
        System.out.println(Arrays.toString(sort(array1)));
        int[] array2 = {4, 7, 93, 45, 0, 23, 17};
        System.out.println(Arrays.toString(sort(array2)));
        int[] array3 = {5, -23, 75, -108, 0, 555, -13};
        System.out.println(Arrays.toString(sort(array3)));
    }

    public static int[] sort(int[] array) {
        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        for (int i = 0; i < (sorted.length - 1); i++) {
            for (int j = 0; j < (sorted.length - 1); j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}
