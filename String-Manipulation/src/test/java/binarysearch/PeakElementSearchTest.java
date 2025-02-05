package binarysearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PeakElementSearchTest {

    @Test
    void testFindPeakElement() {
        assertEquals(2, PeakElement.findPeakElement(new int[]{1, 3, 20, 4, 1, 0}));
        assertEquals(1, PeakElement.findPeakElement(new int[]{1, 5, 3, 2}));
        assertEquals(0, PeakElement.findPeakElement(new int[]{10, 9, 8, 7}));
        assertEquals(4, PeakElement.findPeakElement(new int[]{1, 2, 3, 4, 5}));
        assertTrue(new int[]{2, 5, 8, 6, 3, 7, 4}[
                PeakElement.findPeakElement(new int[]{2, 5, 8, 6, 3, 7, 4})] >= 6);
    }
}
