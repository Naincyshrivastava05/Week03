
import org.junit.jupiter.api.Test;
import sorting_in_large_dataset.CompareSorting;

import java.util.Arrays;
        import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareSortingTest {

    @Test
    public void testSortingPerformance() {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            int[] arr = new int[size];

            // Measure time for Bubble Sort (Skip for large arrays)
            if (size <= 10000) {
                long startTime = System.currentTimeMillis();
                CompareSorting.bubbleSort(arr);
                long endTime = System.currentTimeMillis();
                System.out.println("Bubble Sort time for N=" + size + " : " + (endTime - startTime) + "ms");
            }

            // Measure time for Merge Sort
            long startTime = System.currentTimeMillis();
            CompareSorting.mergeSort(arr, 0, arr.length - 1);
            long endTime = System.currentTimeMillis();
            System.out.println("Merge Sort time for N=" + size + " : " + (endTime - startTime) + "ms");

            // Measure time for Quick Sort
            startTime = System.currentTimeMillis();
            CompareSorting.quickSort(arr, 0, arr.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Quick Sort time for N=" + size + " : " + (endTime - startTime) + "ms");

            assertTrue(isSorted(arr));
            assertTrue(isSorted(arr));
        }
    }

    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}
