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
        if (size >= 1 && size <= 12) {
            int rowNumber = 0;
            int columnNumber = 1;
            System.out.printf("%6s", " ");
            for (int i = columnNumber; i <= size; i++) {
                System.out.printf("%-6d", i);
            }
            System.out.println();
            System.out.println();
            rowNumber++;
            columnNumber = 0;
            for (int i = columnNumber; i <= size; i++) {
                if (i == 0) {
                    System.out.printf("%-6d", rowNumber);
                    continue;
                }
                System.out.printf("%-6d", i * rowNumber);
                if (i == size && rowNumber < size) {
                    System.out.println();
                    System.out.println();
                    rowNumber++;
                    i = -1;
                }
            }
        }
    }
}
