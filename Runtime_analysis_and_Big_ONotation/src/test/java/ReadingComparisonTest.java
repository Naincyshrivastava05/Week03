import org.junit.jupiter.api.Test;
import readercomparison.LargeFileReadingComparison;
import sorting_in_large_dataset.CompareSorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadingComparisonTest {
    @Test
    public void testSortingPerformance() {
        String filePath = "C:\\Users\\Webcom Computers\\Downloads\\example.txt"; // Ensure this file exists with large data


            double[] ans = LargeFileReadingComparison.compare(filePath);
            assertTrue(ans[0]>ans[1]);
            assertTrue(ans[1]>ans[2]);

    }
}
