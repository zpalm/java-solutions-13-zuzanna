package pl.coderstrust.fibonacci;

import java.util.HashMap;

public class FibonacciChecker {

    private static HashMap<Integer, Long> fibonacciNumbers;

    static {
        fibonacciNumbers = new HashMap<>();
        fibonacciNumbers.put(0, 0L);
        fibonacciNumbers.put(1, 1L);
    }

    boolean isFibonacciNumber(long number) {
        if (fibonacciNumbers.containsValue(number)) {
            return true;
        } else {
            return fibonacci(number);
        }
    }

    private boolean fibonacci(long number) {
        long temp = fibonacciNumbers.get(fibonacciNumbers.size() - 2);
        long previousValue = fibonacciNumbers.get(fibonacciNumbers.size() - 1);
        long actualValue = 0;
        for (int i = fibonacciNumbers.size(); actualValue < number; i++) {
            actualValue = temp + previousValue;
            fibonacciNumbers.put(i, actualValue);
            temp = previousValue;
            previousValue = actualValue;
        }
        return actualValue == number;
    }
}
