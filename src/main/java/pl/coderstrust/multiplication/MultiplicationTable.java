package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(4);
        System.out.println();
        printMultiplicationTable(7);
        System.out.println();
        printMultiplicationTable(10);
        System.out.println();
        printMultiplicationTable(12);
    }

    public static void printMultiplicationTable(int size) {
        if (size < 1 || size > 12) {
            System.out.println("Invalid value.");
        }
        System.out.printf("%6s", " ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%-6d", i);
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%-6d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%-6d", j * i);
            }
            System.out.println();
            System.out.println();
        }
    }
}
