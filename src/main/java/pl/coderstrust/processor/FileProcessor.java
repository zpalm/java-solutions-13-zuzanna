package pl.coderstrust.processor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> readLinesFromFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (FileReader reader = new FileReader(new File(fileName));
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public void writeLinesToFile(List<String> lines, String fileName) throws IOException {
        File file = new File("src/test/resources/" + fileName);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            for (String resultLine : lines) {
                writer.write(resultLine + "\n");
            }
        }
    }
}
