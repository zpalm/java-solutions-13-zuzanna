package pl.coderstrust.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCheckerTest {

    @Test
    public void shouldReturnTrueForFive() {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean actual = fibonacciChecker.isFibonacciNumber(5);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueForABigFibonacciNumber() {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean actual = fibonacciChecker.isFibonacciNumber(10610209857723L);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseForFifteen() {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean actual = fibonacciChecker.isFibonacciNumber(15);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

}
