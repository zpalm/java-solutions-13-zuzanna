package pl.coderstrust.processor;

import java.util.Scanner;

public class NumbersProcessor {

    public String processLine(String line) {
        int number;
        int sum = 0;
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(line);
        if (!scanner.hasNextInt()) {
            return "";
        }
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            sum = sum + number;
            result.append(number).append("+");
        }
        result.deleteCharAt(result.length() - 1);
        result.append("=").append(sum);
        return result.toString();
    }
}
