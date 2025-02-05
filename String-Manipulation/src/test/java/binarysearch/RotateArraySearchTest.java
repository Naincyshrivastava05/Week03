import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RotatedArraySearchTest{

    @Test
    void testFindRotationPoint() {
        assertEquals(5, RotationPoint.findRotationPoint(new int[]{6, 7, 9, 15, 19, 2, 3}));
        assertEquals(3, RotationPoint.findRotationPoint(new int[]{4, 5, 6, 1, 2, 3}));
        assertEquals(4, RotationPoint.findRotationPoint(new int[]{10, 12, 15, 20, 1, 5, 7}));
        assertEquals(0, RotationPoint.findRotationPoint(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(2, RotationPoint.findRotationPoint(new int[]{30, 40, 10, 20}));
    }
}
