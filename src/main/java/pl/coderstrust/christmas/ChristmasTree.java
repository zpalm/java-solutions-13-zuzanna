package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printChristmasTree(5)));
        System.out.println(Arrays.toString(printChristmasTree(7)));
        System.out.println(Arrays.toString(printChristmasTree(10)));
    }

    public static String[] printChristmasTree(int size) {
        if (size < 3) {
            System.out.println("Size must be greater than 2.");
            throw new IllegalArgumentException();
        }
        List<String> result = new ArrayList<>();
        StringBuilder christmasTree = new StringBuilder();
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                christmasTree.append(" ");
            }
            for (int j = (size - i); j < (i + size - 1); j++) {
                christmasTree.append("*");
            }
            christmasTree.append(System.getProperty("line.separator"));
        }
        for (int i = 1; i < (size - 2); i++) {
            christmasTree.append(" ");
        }
        for (int i = (size - 2); i < size; i++) {
            christmasTree.append("*");
        }
        result.add(christmasTree.toString());
        return result.toArray(new String[result.size()]);
    }
}
