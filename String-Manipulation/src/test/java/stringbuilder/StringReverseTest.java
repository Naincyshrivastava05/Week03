package stringbuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;
import stringbuilder.StringReverse;


public class StringReverseTest {
    @Test
    public  void testReverseString() {
        // Test Case 1: Normal word
        assertEquals("olleh" ,StringReverse.reverse("hello"));

        // Test Case 2: Single character
        assertEquals("a", StringReverse.reverse("a"));

        // Test Case 3: Empty string
        assertEquals("", StringReverse.reverse(""));

        // Test Case 4: String with spaces
        assertEquals("dlroW olleH", StringReverse.reverse("Hello World"));

        // Test Case 6: String with numbers
        assertEquals("321cba", StringReverse.reverse("abc123"));
    }
}
