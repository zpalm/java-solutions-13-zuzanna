package pl.coderstrust.multiplication;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTableTest {

    @Test
    public void shouldReturnResultsForSizeFive() {
        int[][] actual = MultiplicationTable.printMultiplicationTable(5);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnInvalidValueMessage() {
        MultiplicationTable.printMultiplicationTable(13);
    }

}