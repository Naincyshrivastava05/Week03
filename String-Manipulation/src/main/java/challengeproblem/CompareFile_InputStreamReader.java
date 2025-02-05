package challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareFile_InputStreamReader {
    public static void compareFileReadingMethods(String filePath) throws IOException {
        long startTime, endTime;
        int wordCount;

        // Using FileReader
        startTime = System.nanoTime();
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            wordCount = 0;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount);
        System.out.println("FileReader time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using InputStreamReader
        startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            wordCount = 0;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {
        String filePath = "sample.txt";
    }
}