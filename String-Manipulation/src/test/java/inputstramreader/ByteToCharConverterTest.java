package inputstramreader;


    import inputstreamreader.bytetochar.ByteToCharConverter;
    import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ByteToCharConverterTest {

        @Test
        void testReadFile() throws IOException {
            String testFileName = "testfile.txt";
            String testContent = "Hello, this is a test file.";

            // Create a temporary test file
            try (FileWriter writer = new FileWriter(testFileName)) {
                writer.write(testContent);
            }

            // Test the method
            String result = ByteToCharConverter.readFileAsString(testFileName);
            assertEquals(testContent, result);

            // Cleanup
            new File(testFileName).delete();
        }
    }


