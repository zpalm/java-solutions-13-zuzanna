package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TrapezoidTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {1, 3, 1, 2},
                {4, 8, 3, 18},
                {11.3, 7.8, 4.6, 43.93}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public double topBase;

    @Parameterized.Parameter(1)
    public double bottomBase;

    @Parameterized.Parameter(2)
    public double height;

    @Parameterized.Parameter(3)
    public double expected;

    @Test
    public void setAndGetTopBaseTest() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setTopBase(topBase);
        Assert.assertEquals(topBase, trapezoid.getTopBase(), 0);
    }

    @Test
    public void setAndGetBottomBaseTest() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setBottomBase(bottomBase);
        Assert.assertEquals(bottomBase, trapezoid.getBottomBase(), 0);
    }

    @Test
    public void setAndGetHeightTest() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setHeight(height);
        Assert.assertEquals(height, trapezoid.getHeight(), 0);
    }

    @Test
    public void calculateArea() {
        Trapezoid trapezoid = new Trapezoid(topBase, bottomBase, height);
        Assert.assertEquals(expected, trapezoid.calculateArea(), 0.1);
    }
}
