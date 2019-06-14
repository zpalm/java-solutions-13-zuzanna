package pl.coderstrust.processor;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FileProcessorTest {

    @Test
    public void readLinesFromFile() throws IOException {
        FileProcessor fileProcessor = new FileProcessor();
        List<String> result = fileProcessor.readLinesFromFile(ClassLoader.getSystemResource("testInput.txt").getFile());
        List<String> expected = Arrays.asList(
                "         ",
                "Not a number",
                "   1     2  3     4",
                "5 6 7    8"
        );
        Assert.assertEquals(expected, result);
    }

    @Test
    public void writeLinesToFile() throws IOException {
        FileProcessor fileProcessor = new FileProcessor();
        List<String> test = Arrays.asList(
                "1+2+3+4=10",
                "",
                "1+1+1+1+1=5"
        );
        fileProcessor.writeLinesToFile(test, "testResultOutput.txt");
        List<String> result = Files.readAllLines(Paths.get("src/test/resources/testResultOutput.txt"));
        List<String> expected = Files.readAllLines(Paths.get("src/test/resources/expectedResult.txt"));
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}
