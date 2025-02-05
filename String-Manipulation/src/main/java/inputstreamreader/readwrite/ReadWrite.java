package inputstreamreader.readwrite;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadWrite {
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    public static void writeUserInputToFile(String filePath) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr);
             FileWriter writer = new FileWriter(filePath, StandardCharsets.UTF_8)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "sample.txt";

        try {
            writeUserInputToFile(filePath);
            System.out.println("User input saved to file.");

            String content = readFile(filePath);
            System.out.println("File Content:\n" + content);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
