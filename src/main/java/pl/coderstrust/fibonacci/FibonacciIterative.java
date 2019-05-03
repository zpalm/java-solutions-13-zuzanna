package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(13));
        System.out.println(fibonacci(29));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 0) {
            throw new IllegalArgumentException("The number must be greater than or equal to 0.");
        }
        long temp = 0;
        long previousValue = 1;
        long actualValue = 0;
        for (int i = 1; i < fibonacciNumberInOrder; i++) {
            actualValue = temp + previousValue;
            temp = previousValue;
            previousValue = actualValue;
        }
        return actualValue;
    }
}
