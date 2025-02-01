package Countsort;

public class CountSort {
    public static void countingSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        // Find the maximum and minimum values in the array
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Store the count of each element
        for (int num : arr) {
            count[num - min]++;
        }

        // Compute cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

}
