package challengeproblem2;

import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstAndLastOccurenceChallengeTest {


    @Test
    public void testFindFirstMissingPositive() {
        int[] nums = {3, 4, -1, 1};
        assertEquals(2, ChallengeProblem2.findFirstMissingPositive(nums), "First missing positive should be 2.");

        nums = {1, 2, 0};
        assertEquals(3, ChallengeProblem2.findFirstMissingPositive(nums), "First missing positive should be 3.");

        nums = {-1, -2, -3};
        assertEquals(1, ChallengeProblem2.findFirstMissingPositive(nums), "First missing positive should be 1.");
    }

    @Test
    public void testBinarySearch() {
        int[] nums = {-1, 1, 3, 4};
        Arrays.sort(nums); // Ensure it's sorted for binary search

        assertEquals(2, ChallengeProblem2.binarySearch(nums, 4), "Target 4 should be at index 2.");
        assertEquals(-1, ChallengeProblem2.binarySearch(nums, 5), "Target 5 should not be found.");
    }
}

