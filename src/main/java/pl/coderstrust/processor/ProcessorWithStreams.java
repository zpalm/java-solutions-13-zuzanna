package pl.coderstrust.processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ProcessorWithStreams {

    public void process(String fileName, String resultFileName) throws IOException {
        Files.write(Paths.get("src/test/resources/" + resultFileName), Files.lines(Paths.get("src/test/resources/" + fileName))
                .filter(line -> !line.matches("(.*)\\p{Alpha}(.*)") && line.trim().length() > 0)
                .map(line -> line.trim().split("\\W+"))
                .map(splitLine -> {
                    int sum = Arrays.stream(splitLine).mapToInt(Integer::parseInt).sum();
                    return String.join("+", splitLine).concat("=" + sum + "\n");
                })
                .reduce("", (s1, s2) -> s1 + s2)
                .getBytes()
        );
    }
}
