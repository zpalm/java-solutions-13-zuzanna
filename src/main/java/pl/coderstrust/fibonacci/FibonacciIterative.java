package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(13));
        System.out.println(fibonacci(29));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        long n1 = 0;
        long n2 = 1;
        long result = 0;
        for (int i = 1; i < fibonacciNumberInOrder; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}
