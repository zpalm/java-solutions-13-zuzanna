package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RectangleTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {1, 3, 3},
                {5, 7, 35},
                {9.3, 7.7, 71.61}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public double length;

    @Parameterized.Parameter(1)
    public double width;

    @Parameterized.Parameter(2)
    public double expected;

    @Test
    public void setAndGetLengthTest() {
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(length, rectangle.getLength(), 0);
    }

    @Test
    public void setAndGetWidthTest() {
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(width, rectangle.getWidth(), 0);
    }

    @Test
    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(expected, rectangle.calculateArea(), 0.1);
    }
}
