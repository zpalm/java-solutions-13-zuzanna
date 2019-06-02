package pl.coderstrust.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort implements SortingMethod {

    public int[] sort(int[] array) {
        List<Integer> sortedList = new ArrayList<>(array.length);
        for (int i : array) {
            sortedList.add(i);
        }
        Collections.sort(sortedList);
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = sortedList.get(i);
        }
        return sortedArray;
    }
}
