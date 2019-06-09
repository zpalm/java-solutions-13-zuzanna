package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SquareTest {

    @Parameterized.Parameters
    public static Collection test() {
        Object[][] test = {
                {1, 1},
                {5, 25},
                {12.4, 153.76}
        };
        return Arrays.asList(test);
    }

    @Parameterized.Parameter
    public double side;

    @Parameterized.Parameter(1)
    public double expected;

    @Test
    public void setAndGetSideTest() {
        Square square = new Square();
        square.setSide(side);
        Assert.assertEquals(side, square.getSide(), 0);
    }

    @Test
    public void calculateAreaTest() {
        Square square = new Square(side);
        Assert.assertEquals(expected, square.calculateArea(), 0.1);
    }
}
