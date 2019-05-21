package pl.coderstrust.pascal;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTest {

    @Test
    public void shouldReturnResultsForInputOfFive() {
        List<String> actual = PascalTriangle.getPascalTriangle(5);
        List<String> expected = new ArrayList<>();
        expected.add("1 ");
        expected.add("1 1 ");
        expected.add("1 2 1 ");
        expected.add("1 3 3 1 ");
        expected.add("1 4 6 4 1 ");
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnInvalidValueMessage() {
        PascalTriangle.getPascalTriangle(0);
    }

}
