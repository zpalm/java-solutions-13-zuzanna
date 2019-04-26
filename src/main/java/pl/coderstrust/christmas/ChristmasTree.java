package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(5);
        System.out.println();
        printChristmasTree(7);
        System.out.println();
        printChristmasTree(10);
    }

    public static void printChristmasTree(int size) {
        if (size < 2) {
            System.out.println("Invalid size.");
        }
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (int j = (size - i); j < (i + size - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < (size - 2); i++) {
            System.out.print(" ");
        }
        for (int i = size - 2; i < size; i++) {
            System.out.print("*");
        }
    }
}
