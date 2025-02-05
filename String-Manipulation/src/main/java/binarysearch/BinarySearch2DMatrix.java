package binarysearch;

public class BinarySearch2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        int left = 0, right = numRows * numColumns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert the mid index to row and column
            int midRow = mid / numColumns;
            int midCol = mid % numColumns;

            if (matrix[midRow][midCol] == target) {
                return true;
            } else if (matrix[midRow][midCol] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 5;
        System.out.println("Target found: " + searchMatrix(matrix, target));  // Expected: true

        target = 20;
        System.out.println("Target found: " + searchMatrix(matrix, target));  // Expected: false
    }
}

