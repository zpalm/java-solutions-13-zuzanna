package pl.coderstrust.fibonacci;

import java.util.HashMap;

public class FibonacciChecker {

    private static long N;
    private static HashMap<Long, Boolean> cache = new HashMap<Long, Boolean>();

    boolean isFibonacciNumber(long number) {
        if (!cache.containsKey(number)) {
            return fibonacci(number);
        }
        return cache.get(number);
    }

    private boolean fibonacci(long number) {
        N = number;
        double i = (Math.log(number) + Math.log(Math.sqrt(5))) / Math.log((Math.sqrt(5) + 1) / 2);
        if (fib(i)) {
            cache.put(number, true);
            return true;
        }
        return false;
    }

    private boolean fib(double i) {
        if (Math.round(((Math.pow((Math.sqrt(5) + 1) / 2, (int) Math.ceil(i))) / Math.sqrt(5))) == N || Math.round(((Math.pow((Math.sqrt(5) + 1) / 2, (int) Math.floor(i))) / Math.sqrt(5))) == N) {
            return true;
        }
        return false;
    }
}
