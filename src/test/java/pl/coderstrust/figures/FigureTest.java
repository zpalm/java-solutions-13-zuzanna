package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FigureTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {new Circle(5), 78.5},
                {new Rectangle(4.5, 7), 31.5},
                {new Square(11), 121},
                {new Trapezoid(5.5, 4, 2), 9.5},
                {new Triangle(4.9, 3), 7.35}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public Figure implementation;

    @Parameterized.Parameter(1)
    public double expected;

    @Test
    public void calculateArea() {
        Assert.assertEquals(expected, implementation.calculateArea(), 0.1);
    }
}
