package pl.coderstrust.sort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public abstract class SortingTestBase {
    public abstract SortingMethod getSortingMethod();

    @Parameterized.Parameters
    public static Collection sort() {
        int[][][] testResults = {
                {{}, {}},
                {{1}, {1}},
                {{1, 1}, {1, 1}},
                {{1, 2, 3, 2, 1}, {1, 1, 2, 2, 3}},
                {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}},
                {{5, 4, 3, 2, 1}, {1, 2, 3, 4, 5}},
                {{7, 2, -5, 0, 4}, {-5, 0, 2, 4, 7}},
        };
        return Arrays.asList(testResults);
    }

    @Parameterized.Parameter
    public int[] given;
    @Parameterized.Parameter(1)
    public int[] expected;

    @Test
    public void shouldSortSimpleArray() {
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        Assert.assertArrayEquals(expected, result);
    }
}
