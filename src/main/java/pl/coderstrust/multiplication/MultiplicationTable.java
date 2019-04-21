package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printMultiplicationTable(7);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printMultiplicationTable(10);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printMultiplicationTable(12);

    }

    public static void printMultiplicationTable(int size) {
        if (size >= 1 && size <= 12) {
            int rowNumber = 0;
            int columnNumber = 1;
            //first row
            for (int i = columnNumber; i <= size; i++) {
                if (i == 1) {
                    System.out.print("      ");
                } else if (i > 1 && i <= 9) {
                    System.out.print("     ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(i);
                if (i == size) {
                    System.out.println();
                    System.out.println();
                }
            }
            //next rows
            rowNumber = 1;
            columnNumber = 0;
            for (int i = columnNumber; i <= size; i++) {
                if (i == 0) {
                    System.out.print(rowNumber);
                    continue;
                }
                if ((rowNumber <= 9 && i * rowNumber <= 9)) {
                    System.out.print("     ");
                } else if ((rowNumber <= 9 && i * rowNumber >= 10 && i * rowNumber <= 99)) {
                    System.out.print("    ");
                } else if ((rowNumber <= 9 && i * rowNumber >= 100)) {
                    System.out.print("   ");
                } else if ((rowNumber >= 10 && i * rowNumber == rowNumber)) {
                    System.out.print("   ");
                } else if ((rowNumber >= 10 && i * rowNumber > rowNumber && i * rowNumber <= 99)) {
                    System.out.print("    ");
                } else if ((rowNumber >= 10 && i * rowNumber >= 100)) {
                    System.out.print("   ");
                }
                System.out.print(i * rowNumber);
                if (i == size && rowNumber < size) {
                    System.out.println();
                    System.out.println();
                    rowNumber = rowNumber + 1;
                    i = -1;
                }
            }
        }
    }
}
