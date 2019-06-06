package pl.coderstrust.fibonacci;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FibonacciCheckerTest {

    @Parameterized.Parameters
    public static Collection isFibonacciNumber() {
        Object[][] testResults = {
                {0, true},
                {1, true},
                {4, false},
                {8, true},
                {9, false},
                {1597, true},
                {514220, false},
                {10610209857723L, true}
        };
        return Arrays.asList(testResults);
    }

    @Parameterized.Parameter
    public long given;
    @Parameterized.Parameter(1)
    public boolean expected;

    @Test
    public void shouldReturnResult() {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();
        boolean result = fibonacciChecker.isFibonacciNumber(given);
        Assert.assertEquals(expected, result);
    }
}
