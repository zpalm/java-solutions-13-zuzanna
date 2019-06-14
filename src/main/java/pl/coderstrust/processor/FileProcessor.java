package pl.coderstrust.processor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (FileReader reader = new FileReader(new File(fileName));
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't read the file!");
        }
        return lines;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) {
        File file = new File("src/test/resources/" + resultFileName);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            for (String resultLine : resultLines) {
                writer.write(resultLine + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Couldn't write to a new file!");
        }
    }
}
