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
