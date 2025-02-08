
import org.junit.jupiter.api.Test;
import sorting_in_large_dataset.CompareSorting;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareSortingTest {

    @Test
    public void testSortingPerformance() {
        int[] sizes = {1000,10000,1000000};
        for(int size:sizes) {
            double[] ans = CompareSorting.compare(size);
            assertTrue(ans[0]>ans[1]);
            assertTrue(ans[1]>ans[2]);
        }
        }


}
