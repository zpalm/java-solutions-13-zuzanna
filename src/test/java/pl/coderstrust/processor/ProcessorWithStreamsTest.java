package pl.coderstrust.processor;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProcessorWithStreamsTest {

    @Test
    public void streamProcess() throws IOException {
        ProcessorWithStreams processorWithStreams = new ProcessorWithStreams();
        processorWithStreams.process("1000.txt", "streamResult.txt");
        List<String> result = Files.readAllLines(Paths.get("src/test/resources/streamResult.txt"));
        List<String> expected = Files.readAllLines(Paths.get("src/test/resources/expectedStreamResult.txt"));
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}
