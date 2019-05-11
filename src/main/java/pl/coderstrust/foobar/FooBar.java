package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FooBar {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fooBar(0, 100)));
    }

    public static String[] fooBar(int firstNumber, int lastNumber) {
        List<String> result = new ArrayList<>();
        for (int i = firstNumber; i <= lastNumber; i++) {
            StringBuilder foobar = new StringBuilder();
            foobar.append(i).append(" ");
            if (i % 3 == 0) {
                foobar.append("Foo");
            }
            if (i % 5 == 0) {
                foobar.append("Bar");
            }
            result.add(foobar.toString());
        }
        return result.toArray(new String[result.size()]);
    }
}
