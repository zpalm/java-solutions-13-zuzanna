package pl.coderstrust.christmas;

import org.junit.Assert;
import org.junit.Test;

public class ChristmasTreeTest {

    @Test
    public void shouldPrintATreeOfSizeSix() {
        String[] actual = ChristmasTree.printChristmasTree(6);
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
        ChristmasTree.printChristmasTree(1);
    }
}
