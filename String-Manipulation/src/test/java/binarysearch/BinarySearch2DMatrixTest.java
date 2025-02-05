package binarysearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearch2DMatrixTest {

    @Test
    public void testSearchMatrixFound() {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target = 5;
        assertTrue(BinarySearch2DMatrix.searchMatrix(matrix, target), "Target 5 should be found.");
    }

    @Test
    public void testSearchMatrixNotFound() {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target = 20;
        assertFalse(BinarySearch2DMatrix.searchMatrix(matrix, target), "Target 20 should not be found.");
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix = {};
        int target = 5;
        assertFalse(BinarySearch2DMatrix.searchMatrix(matrix, target), "Target should not be found in an empty matrix.");
    }

    @Test
    public void testSingleElementMatrix() {
        int[][] matrix = {{5}};
        int target = 5;
        assertTrue(BinarySearch2DMatrix.searchMatrix(matrix, target), "Target 5 should be found in a single element matrix.");
    }
}
