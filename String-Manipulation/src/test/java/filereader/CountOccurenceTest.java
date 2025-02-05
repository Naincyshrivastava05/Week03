package filereader;

import static org.junit.jupiter.api.Assertions.*;

import filereader.couuntoccurence.CountOccurenc;
import org.junit.jupiter.api.Test;
import java.io.*;

class CountOccurenceTest {

    @Test
    void testCountWordOccurrences() throws IOException {
        // Create a temporary test file
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("How much wood a woodchuck chuck\n");
            writer.write("If a woodchuck could chuck wood");
        }

        // Run the test
        int count = CountOccurenc.wordOccurence(tempFile.getAbsolutePath(), "wood");

        // Verify the result
        assertEquals(2 , count);
    }
}
