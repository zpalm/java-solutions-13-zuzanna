package pl.coderstrust.fibonacci;

import java.util.HashMap;

public class FibonacciChecker {

    private static HashMap<Long, Boolean> cache = new HashMap<Long, Boolean>();

    boolean isFibonacciNumber(long number) {
        if (!cache.containsKey(number)) {
            cache.put(number, fibonacci(number));
        }
        return cache.get(number);
    }

    private boolean fibonacci(long number) {
        double nthFibonacciNumber = (Math.log(number) + Math.log(Math.sqrt(5))) / Math.log((Math.sqrt(5) + 1) / 2);
        if (Math.round(((Math.pow((Math.sqrt(5) + 1) / 2, (int) Math.round(nthFibonacciNumber))) / Math.sqrt(5))) == number) {
            return true;
        } else {
            return false;
        }
    }
}
