package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printChristmasTree(7);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printChristmasTree(10);
    }

    public static void printChristmasTree(int size) {
        if (size < 2) {
            System.out.println("Invalid size");
        }
        int row = 1;
        int column = 1;
        for (int i = column; i < (size + row); i++) {
            if (row == size) {
                for (i = 1; i <= size; i++) {
                    if (i <= (size - 2)) {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                }
                break;
            }
            if (i <= (size - row)) {
                System.out.print(" ");
            }
            if (i > (size - row) && i < size + (row - 1)) {
                System.out.print("*");
            }
            if (i == size + (row - 1)) {
                System.out.print("*");
                System.out.println();
                row++;
                i = 0;
            }
        }
    }
}
