package pl.coderstrust.christmas;

import org.junit.Assert;
import org.junit.Test;

public class ChristmasTreeTest {

    @Test
    public void shouldPrintATreeOfSizeSix() {
        String[] actual = ChristmasTree.getChristmasTree(6);
        String[] expected = {
                "    *" +     System.getProperty("line.separator") +
                "   ***" +    System.getProperty("line.separator") +
                "  *****" +   System.getProperty("line.separator") +
                " *******" +  System.getProperty("line.separator") +
                "*********" + System.getProperty("line.separator") +
                "   **"
        };
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnInvalidValueMessage() {
        ChristmasTree.getChristmasTree(1);
    }
}
