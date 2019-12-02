package pl.coderstrust.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSort implements SortingMethod {

    public int[] sort(int[] array) {
        List<Integer> sortedList = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        return sortedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
