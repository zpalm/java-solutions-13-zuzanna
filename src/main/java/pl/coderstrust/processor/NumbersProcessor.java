package pl.coderstrust.processor;

public class NumbersProcessor {

    public String processLine(String line) {
        if (line.trim().length() == 0 || line.matches("(.*)\\p{Alpha}(.*)")) {
            return "";
        }
        String[] lines = line.trim().split("\\W+");
        int[] numbers = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            numbers[i] = Integer.parseInt(lines[i]);
        }
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append("+");
            } else {
                result.append("=").append(sum);
            }
        }
        return result.toString();
    }
}
