package pl.coderstrust.sort;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        sort(sortedArray, sortedArray.length);
        return sortedArray;
    }

    private void sort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int[] left = new int[length / 2];
        int[] right = new int[length - (length / 2)];
        for (int i = 0; i < length / 2; i++) {
            left[i] = array[i];
        }
        for (int i = length / 2, j = 0; i < length; i++, j++) {
            right[j] = array[i];
        }
        sort(left, left.length);
        sort(right, right.length);
        sortMerge(array, left, right, length / 2, length - (length / 2));
    }

    private void sortMerge(int[] array, int[] leftHalf, int[] rightHalf, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }
        while (i < left) {
            array[k++] = leftHalf[i++];
        }
        while (j < right) {
            array[k++] = rightHalf[j++];
        }
    }
}
