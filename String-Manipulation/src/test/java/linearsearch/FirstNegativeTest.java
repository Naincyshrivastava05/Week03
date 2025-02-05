package linearsearch;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FirstNegativeTest {



        @Test
        void testFindFirstNegative() {
            assertEquals(3, FirstNegative.findFirstNegative(new int[]{3, 5, 7, -2, 8, -5}));
            assertEquals(0, FirstNegative.findFirstNegative(new int[]{-1, 2, 3, 4}));
            assertEquals(2, FirstNegative.findFirstNegative(new int[]{1, 2, -3, 4, 5}));
            assertEquals(-1, FirstNegative.findFirstNegative(new int[]{1, 2, 3, 4, 5}));
            assertEquals(1, FirstNegative.findFirstNegative(new int[]{10, -20, 30, -40}));
        }
    }


