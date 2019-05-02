package pl.coderstrust.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(17));
        System.out.println(fibonacci(24));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder == 1 || fibonacciNumberInOrder == 2) {
            return 1;
        }
        return fibonacci((fibonacciNumberInOrder - 1)) + fibonacci((fibonacciNumberInOrder - 2));
    }
}
