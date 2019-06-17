package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class IpAddressValidatorTest {

    @Ignore("Execution time: 12784791 ms")
    @Test
    public void testForIsIPAddress() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 255; i++) {
            for (int j = 0; j <= 255; j++) {
                for (int k = 0; k <= 255; k++) {
                    for (int l = 0; l <= 255; l++) {
                        Assert.assertTrue(IpAddressValidator.isIpAddress(String.format("%d.%d.%d.%d", i, j, k, l)));
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
    }

    @Test
    @Parameters({"%d.1.1.1", "1.%d.1.1", "1.1.%d.1", "1.1.1.%d"})
    public void smartTestForValidIpAddresses(String ipAddressTemplate) {
        for (int i = 0; i <= 255; i++) {
            Assert.assertTrue(IpAddressValidator.isIpAddress(String.format(ipAddressTemplate, i)));
        }
    }

    @Test
    @Parameters({"0", "0000", "0.0.0.256", "abc", "172.016.254.001", "010255"})
    public void shouldReturnFalseForInvalidIpAddresses(String ipAddress) {
        Assert.assertFalse(IpAddressValidator.isIpAddress(ipAddress));
    }

    @Test
    @Parameters({"192.168.0.110", "172.16.254.1", "0.0.0.0", "255.255.255.255", "1.2.3.4", "1.10.100.255"})
    public void shouldReturnTrueForValidIpAddresses(String ipAddress) {
        Assert.assertTrue(IpAddressValidator.isIpAddress(ipAddress));
    }
}
