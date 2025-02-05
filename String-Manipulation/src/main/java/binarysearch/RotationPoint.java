package binarysearch;

public class RotationPoint{
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1; // Rotation point is in the right half
            } else {
                right = mid; // Rotation point is in the left half
            }
        }
        return left; // The smallest element's index
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 15, 19, 2, 3}; // Rotated sorted array
        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation point index: " + rotationIndex);
    }
}
