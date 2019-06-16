package pl.coderstrust.processor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ProcessorWithStreams {

    public void process(String fileName, String resultFileName) throws IOException {
        File file = new File("src/test/resources/" + resultFileName);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
             Stream<String> stream = Files.lines(Paths.get("src/test/resources/" + fileName))) {
            stream.filter(line -> !line.matches("(.*)\\p{Alpha}(.*)") && line.trim().length() > 0)
                    .forEach(line -> {
                        String[] splitLine = line.trim().split("\\W+");
                        int sum = Arrays.stream(splitLine).mapToInt(Integer::parseInt).sum();
                        line = String.join("+", splitLine).concat("=" + sum);
                        try {
                            writer.write(line + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
