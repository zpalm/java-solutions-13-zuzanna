package pl.coderstrust.pascal;

import org.junit.Assert;
import org.junit.Test;

public class PascalTriangleTest {

    @Test
    public void shouldReturnResultsForInputOfFive() {
        String[] actual = PascalTriangle.getPascalTriangle(5);
        String[] expected = {
                "               1     " +             System.getProperty("line.separator") +
                "            1     1     " +          System.getProperty("line.separator") +
                "         1     2     1     " +       System.getProperty("line.separator") +
                "      1     3     3     1     " +    System.getProperty("line.separator") +
                "   1     4     6     4     1     " + System.getProperty("line.separator")
        };
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnInvalidValueMessage() {
        PascalTriangle.getPascalTriangle(0);
    }
    
}
