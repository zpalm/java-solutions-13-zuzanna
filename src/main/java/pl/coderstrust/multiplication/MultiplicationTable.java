package pl.coderstrust.multiplication;

import java.util.Arrays;

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getMultiplicationTable(4)));
        System.out.println(Arrays.deepToString(getMultiplicationTable(7)));
        System.out.println(Arrays.deepToString(getMultiplicationTable(10)));
        System.out.println(Arrays.deepToString(getMultiplicationTable(12)));
    }

    public static int[][] getMultiplicationTable(int size) {
        if (size < 1 || size > 12) {
            System.out.println("Size must be greater than 0 and smaller or equal to 12.");
            throw new IllegalArgumentException();
        }
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }
}
