package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(getPascalTriangle(4));
        System.out.println(getPascalTriangle(7));
        System.out.println(getPascalTriangle(11));
    }

    public static List<String> getPascalTriangle(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        List<String> result = new ArrayList<>();
        StringBuilder pascalTriangle = new StringBuilder();
        long nodeValue;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                nodeValue = factorial(i) / (factorial(j) * factorial(i - j));
                pascalTriangle.append(nodeValue).append(" ");
            }
            result.add(pascalTriangle.toString());
            pascalTriangle.setLength(0);
        }
        return result;
    }

    private static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
