package filereader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReadLineByLineTest {
    @Test
    public void readTest() {
        String filePath = "C:\\Gabgemini\\Week03\\String-Manipulation\\src\\main\\java\\filereader\\text.txt";
        String s = ReadLineByLine.reader(filePath);

        // Debugging output
        System.out.println("Actual Output: [" + s + "]");

        // Ensuring line separators are platform-independent
        String s2 = "Hello\nHii\nHola";

        assertEquals(s2, s.trim(), "File content does not match expected output.");
    }
}
