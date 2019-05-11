package pl.coderstrust.foobar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FooBarTest {

    private FooBar foobar;
    private String[] actualArray;

    @Before
    public void setUp() {
        foobar = new FooBar();
        actualArray = foobar.fooBar(0, 100);
    }

    @Test
    public void shouldReturnFooForThree() {
        String actualResult = actualArray[3];
        String expectedResult = "3 Foo";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnBarForFive() {
        String actualResult = actualArray[5];
        String expectedResult = "5 Bar";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnFooBarForFifteen() {
        String actualResult = actualArray[15];
        String expectedResult = "15 FooBar";
        Assert.assertEquals(expectedResult, actualResult);
    }
}