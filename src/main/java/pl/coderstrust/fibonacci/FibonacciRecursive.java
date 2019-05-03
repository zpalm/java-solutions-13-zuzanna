package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(17));
        System.out.println(fibonacci(24));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("The number must be greater than or equal to 0.");
        }
        if (fibonacciNumberInOrder < 2) {
            return fibonacciNumberInOrder;
        }
        return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
    }
}
