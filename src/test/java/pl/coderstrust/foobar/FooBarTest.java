package pl.coderstrust.foobar;

import org.junit.Assert;
import org.junit.Test;

public class FooBarTest {

    @Test
    public void shouldReturnTwentyFirstResults() {
        String[] actualResult = FooBar.fooBar(0, 20);
        String[] expectedResult = {
                "0 FooBar",
                "1 ",
                "2 ",
                "3 Foo",
                "4 ",
                "5 Bar",
                "6 Foo",
                "7 ",
                "8 ",
                "9 Foo",
                "10 Bar",
                "11 ",
                "12 Foo",
                "13 ",
                "14 ",
                "15 FooBar",
                "16 ",
                "17 ",
                "18 Foo",
                "19 ",
                "20 Bar"
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
