package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class IPAddressCheckerTest {

    @Ignore("Execution time: 12784791 ms")
    @Test
    public void testForIsIPAddress() {
        IPAddressChecker ipAddressChecker = new IPAddressChecker();
        long start = System.currentTimeMillis();
        for (int a = 0; a <= 255; a++) {
            for (int b = 0; b <= 255; b++) {
                for (int c = 0; c <= 255; c++) {
                    for (int d = 0; d <= 255; d++) {
                        Assert.assertTrue(ipAddressChecker.isIPAddress(a + "." + b + "." + c + "." + d));
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
    }

    private List<String> correctInput() {
        int i = 0;
        String input = "";
        List<String> inputs = new ArrayList<>();
        while (i <= 255) {
            input = i + ".0.0.0";
            inputs.add(input);
            i++;
        }
        i = 0;
        while (i <= 255) {
            input = "0." + i + ".0.0";
            inputs.add(input);
            i++;
        }
        i = 0;
        while (i <= 255) {
            input = "0.0." + i + ".0";
            inputs.add(input);
            i++;
        }
        i = 0;
        while (i <= 255) {
            input = "0.0.0." + i;
            inputs.add(input);
            i++;
        }
        return inputs;
    }

    @Test
    @Parameters(method = "correctInput")
    public void smartTestForIsIPAddress(String input) {
        IPAddressChecker ipAddressChecker = new IPAddressChecker();
        Assert.assertTrue(ipAddressChecker.isIPAddress(input));
    }

    @Test
    @Parameters({"0", "0000", "0.0.0.256", "abc", "00.0.0", "010255"})
    public void shouldReturnFalse(String input) {
        IPAddressChecker ipAddressChecker = new IPAddressChecker();
        Assert.assertFalse(ipAddressChecker.isIPAddress(input));
    }
}
