package stringbuffer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ConcateStringTest {
    String [] arr  = {"My", "Name","is","Naincy"};
    @Test
    public void f(){
        assertEquals("MyNameisNaincy", ConcateString.concateString(arr));
    }
}
