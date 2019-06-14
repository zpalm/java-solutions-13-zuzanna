package pl.coderstrust.processor;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProcessorIT {

    @Test
    public void process() throws IOException {
        Processor processor = new Processor(new NumbersProcessor(), new FileProcessor());
        processor.process(ClassLoader.getSystemResource("1000.txt").getFile(), "integrationTestResult.txt");
        List<String> result = Files.readAllLines(Paths.get("src/test/resources/integrationTestResult.txt"));
        List<String> expected = Files.readAllLines(Paths.get("src/test/resources/expectedIntegrationTestResult.txt"));
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}
