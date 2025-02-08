import  static org.junit.jupiter.api.Assertions.*;

import StringConcatenation.StringConcatenationComparison;
import org.junit.jupiter.api.Test;


public class StringConcatenationTest {
    @Test
    public void testConcatenation(){
        int[] sizes = {1000,10000,1000000};
        for(int size:sizes) {
            double[] ans = StringConcatenationComparison.compare(size);
            assertTrue(ans[0]>ans[1]);
            assertTrue(ans[1]>ans[2]);
        }
    }
}
