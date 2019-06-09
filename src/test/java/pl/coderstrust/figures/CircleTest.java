package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CircleTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {1, 3.14},
                {4, 50.24},
                {15, 706.8}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public double radius;

    @Parameterized.Parameter(1)
    public double expected;

    @Test
    public void setAndGetRadiusTest() {
        Circle circle = new Circle();
        circle.setRadius(radius);
        Assert.assertEquals(radius, circle.getRadius(), 0);
    }

    @Test
    public void calculateAreaTest() {
        Circle circle = new Circle(radius);
        Assert.assertEquals(expected, circle.calculateArea(), 0.1);
    }
}
