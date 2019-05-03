package pl.coderstrust.pascal;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(4);
        System.out.println();
        printPascalTriangle(7);
        System.out.println();
        printPascalTriangle(11);
    }

    public static void printPascalTriangle(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        long nodeValue = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.printf("%3s", "");
            }
            for (int j = 0; j <= i; j++) {
                nodeValue = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.printf("%-6d", nodeValue);
            }
            System.out.println();
        }
    }

    private static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
