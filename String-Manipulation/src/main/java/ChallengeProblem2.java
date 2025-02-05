    import java.util.Arrays;
public class ChallengeProblem2 {



        // Method to find the first missing positive integer using Linear Search
        public static int findFirstMissingPositive(int[] nums) {
            int n = nums.length;

            // Step 1: Mark numbers that are out of the valid range [1, n]
            for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    // Swap the elements to their correct positions
                    int temp = nums[i];
                    nums[i] = nums[nums[i] - 1];
                    nums[temp - 1] = temp;
                }
            }

            // Step 2: Find the first index where nums[i] != i + 1
            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;  // The first missing positive integer
                }
            }

            return n + 1;  // If all numbers from 1 to n are present
        }

        // Method to perform Binary Search to find the index of a target number
        public static int binarySearch(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;  // Target found at index mid
                } else if (nums[mid] < target) {
                    left = mid + 1;  // Search on the right side
                } else {
                    right = mid - 1;  // Search on the left side
                }
            }

            return -1;  // Target not found
        }

        // Main method to test both methods
        public static void main(String[] args) {
            int[] nums = {3, 4, -1, 1};
            System.out.println("First Missing Positive: " + findFirstMissingPositive(nums));  // Expected: 2

            int target = 4;
            Arrays.sort(nums);  // Sorting array for Binary Search
            int index = binarySearch(nums, target);
            System.out.println("Target index: " + index);  // Expected: 2 (after sorting the array)
        }


}
