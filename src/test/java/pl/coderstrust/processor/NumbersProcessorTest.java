package pl.coderstrust.processor;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters({"         , ",
            "Not a number, ",
            "1   2    3   4, 1+2+3+4=10"})
    public void processLine(String line, String processedLine) {
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        Assert.assertEquals(processedLine, numbersProcessor.processLine(line));
    }
}
