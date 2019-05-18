package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getPascalTriangle(4)).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(getPascalTriangle(7)).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(getPascalTriangle(11)).replace("[", "").replace("]", ""));
    }

    public static String[] getPascalTriangle(int number) {
        if (number < 1) {
            System.out.println("Number must be greater than 0.");
            throw new IllegalArgumentException();
        }
        List<String> result = new ArrayList<>();
        StringBuilder pascalTriangle = new StringBuilder();
        long nodeValue;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i); j++) {
                pascalTriangle.append(String.format("%3s", ""));
            }
            for (int j = 0; j <= i; j++) {
                nodeValue = factorial(i) / (factorial(j) * factorial(i - j));
                pascalTriangle.append(String.format("%-6d", nodeValue));
            }
            pascalTriangle.append(System.getProperty("line.separator"));
        }
        result.add(pascalTriangle.toString());
        return result.toArray(new String[result.size()]);
    }

    private static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
