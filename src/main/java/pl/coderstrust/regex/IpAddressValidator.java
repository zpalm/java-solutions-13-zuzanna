package pl.coderstrust.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidator {
    private static Pattern ipAddressPattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    public static boolean isIpAddress(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        Matcher matcher = ipAddressPattern.matcher(input);
        return matcher.matches();
    }
}
