package binarysearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FirstAndLastOccurenceTest {

    @Test
    public void testSearchRangeFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, FirstAndLastOccurence.searchRange(nums, target), "The first and last occurrences should be correct.");
    }

    @Test
    public void testSearchRangeNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FirstAndLastOccurence.searchRange(nums, target), "The target should not be found.");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, FirstAndLastOccurence.searchRange(nums, target), "The single element should match the target.");
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 3;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FirstAndLastOccurence.searchRange(nums, target), "An empty array should return -1 for both occurrences.");
    }
}
