package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {
        fooBar(0, 100);
    }

    public static void fooBar(int firstNumber, int lastNumber) {
        for (int i = firstNumber; i <= lastNumber; i++) {
            StringBuilder foobar = new StringBuilder();
            foobar.append(i).append(" ");
            if (i % 3 == 0) {
                foobar.append("Foo");
            }
            if (i % 5 == 0) {
                foobar.append("Bar");
            }
            System.out.println(foobar);
        }
    }
}
