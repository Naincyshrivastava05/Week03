package quicksort;

public class QuickSort {
    // Partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // Recursive quick sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partition index
            quickSort(arr, low, pi - 1); // Sort left partition
            quickSort(arr, pi + 1, high); // Sort right partition
        }
    }
}
