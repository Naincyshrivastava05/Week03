package readercomparison;

import java.io.*;

public class LargeFileReadingComparison {

    // Method to read file using FileReader
    public static long readFileWithFileReader(String filePath) throws IOException {
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {
                // Reading character by character
            }
        }
        return System.currentTimeMillis() - startTime;
    }

    // Method to read file using InputStreamReader
    public static long readFileWithInputStreamReader(String filePath) throws IOException {
        long startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {
                // Reading byte stream and converting to characters
            }
        }
        return System.currentTimeMillis() - startTime;
    }

    public static double[] compare(String filePath) throws IOException{
        double[] ans = new double[2];

      ans[0] = readFileWithFileReader(filePath);
        ans[1] = readFileWithInputStreamReader(filePath);

        System.out.println("FileReader time: " + ans[0] + "ms");
        System.out.println("InputStreamReader time: " + ans[1] + "ms");
        return ans;
    }
    // Main Method to Run the Tests
    public static void main(String[] args) throws IOException{
        String filePath = "C:\\Users\\Webcom Computers\\Downloads\\example.txt"; // Ensure this file exists with large data
        compare(filePath);

    }
}

