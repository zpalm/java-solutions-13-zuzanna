package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TriangleTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {1, 1, 0.5},
                {4, 6, 12},
                {15.3, 6.9, 52.785}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public double height;

    @Parameterized.Parameter(1)
    public double base;

    @Parameterized.Parameter(2)
    public double expected;

    @Test
    public void setAndGetHeightTest() {
        Triangle triangle = new Triangle(height, base);
        Assert.assertEquals(height, triangle.getHeight(), 0);
    }

    @Test
    public void setAndGetBaseTest() {
        Triangle triangle = new Triangle(height, base);
        Assert.assertEquals(base, triangle.getBase(), 0);
    }

    @Test
    public void calculateAreaTest() {
        Triangle triangle = new Triangle(height, base);
        Assert.assertEquals(expected, triangle.calculateArea(), 0.1);
    }
}
