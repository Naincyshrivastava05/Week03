package stringbuilder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        assertEquals("progamin", RemoveDuplicates.removeDuplicates("programming"));
        assertEquals("abcd", RemoveDuplicates.removeDuplicates("aabbccdd"));
        assertEquals("abc", RemoveDuplicates.removeDuplicates("abcabcabc"));
        assertEquals("a", RemoveDuplicates.removeDuplicates("aaaa"));
        assertEquals("", RemoveDuplicates.removeDuplicates(""));
        assertEquals("AbBCd", RemoveDuplicates.removeDuplicates("AAbBCCdd"));
        assertEquals("123abc", RemoveDuplicates.removeDuplicates("123123abcabc"));
    }
}
