package pl.coderstrust.pascal;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnCorrectPascalTriangle() {
        List<String> expected = new ArrayList<>();
        expected.add("1 ");
        expected.add("1 1 ");
        expected.add("1 2 1 ");
        expected.add("1 3 3 1 ");
        expected.add("1 4 6 4 1 ");
        List<String> actual = PascalTriangle.getPascalTriangle(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionForInvalidArgument() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Number must be greater than 0.");
        PascalTriangle.getPascalTriangle(0);
    }
}
