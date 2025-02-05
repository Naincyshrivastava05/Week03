package binarysearch;

public class FirstAndLastOccurence {

    // Method to find the first occurrence of the target
    public static int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;  // Found, but continue searching on the left
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Method to find the last occurrence of the target
    public static int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;  // Found, but continue searching on the right
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Main method to find both first and last occurrences
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(nums, target);
        result[1] = findLastOccurrence(nums, target);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First occurrence: " + result[0]);  // Expected: 3
        System.out.println("Last occurrence: " + result[1]);   // Expected: 4

        target = 6;
        result = searchRange(nums, target);
        System.out.println("First occurrence: " + result[0]);  // Expected: -1
        System.out.println("Last occurrence: " + result[1]);   // Expected: -1
    }
}
