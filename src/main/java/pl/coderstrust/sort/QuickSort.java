package pl.coderstrust.sort;

import java.util.Arrays;

public class QuickSort implements SortingMethod {

    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        sort(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    private void sort(int[] array, int first, int last) {
        if (array.length <= 1) {
            return;
        }
        int mid = array[(first + last) / 2];
        int i = first;
        int j = last;
        if ((first + last) / 2 > last || (first + last) / 2 < first) {
            return;
        }
        while (i < j) {
            while (array[i] < mid) {
                i++;
            }
            while (array[j] > mid) {
                j--;
            }
            if (array[i] >= array[j] && i < j) {
                swap(array, i, j);
                i++;
                j--;
            } else if (array[(first + last) / 2] == mid) {
                return;
            }
        }
        if (first < j) {
            sort(array, first, j);
        }
        if (i < last) {
            sort(array, i, last);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
