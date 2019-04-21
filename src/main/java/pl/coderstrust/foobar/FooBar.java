package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {
        fooBar(0, 100);
    }

    public static void fooBar(int firstNumber, int lastNumber) {
        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.print(i);
            if (i % 15 == 0) {
                System.out.print(" FooBar");
            } else if (i % 3 == 0) {
                System.out.print(" Foo");
            } else if (i % 5 == 0) {
                System.out.print(" Bar");
            }
            System.out.println();
        }
    }
}
