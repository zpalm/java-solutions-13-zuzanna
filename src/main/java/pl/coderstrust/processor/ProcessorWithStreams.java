package pl.coderstrust.processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ProcessorWithStreams {

    public void process(String fileName, String resultFileName) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get("src/test/resources/" + fileName))) {
            byte[] result = stream
                    .filter(line -> !line.matches("(.*)\\p{Alpha}(.*)") && line.trim().length() > 0)
                    .map(line -> {
                        String[] splitLine = line.trim().split("\\W+");
                        int sum = Arrays.stream(splitLine).mapToInt(Integer::parseInt).sum();
                        return String.join("+", splitLine).concat("=" + sum + "\n");
                    })
                    .reduce("", (s1, s2) -> s1 + s2)
                    .getBytes();
            Files.write(Paths.get("src/test/resources/" + resultFileName), result);
        }
    }
}
