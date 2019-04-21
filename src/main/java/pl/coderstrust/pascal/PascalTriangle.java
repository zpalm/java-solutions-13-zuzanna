package pl.coderstrust.pascal;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printPascalTriangle(7);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printPascalTriangle(11);
    }

    public static void printPascalTriangle(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int pascalTerm = 0;
        int column = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = column; k <= (number - i) - 1; k++) {
                    if (j >= 1) {
                        break;
                    }
                    System.out.print("  ");
                }
                pascalTerm = factorial(i) / (factorial(j) * factorial(i - j));
                if (pascalTerm < 10) {
                    System.out.print(pascalTerm + "   ");
                } else if (pascalTerm >= 10 && pascalTerm <= 99) {
                    System.out.print(pascalTerm + "  ");
                } else if (pascalTerm >= 100) {
                    System.out.print(pascalTerm + " ");
                }
            }
            System.out.println();
        }
    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
