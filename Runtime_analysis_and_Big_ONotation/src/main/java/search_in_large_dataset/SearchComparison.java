package search_in_large_dataset;

import java.util.Arrays;


public class SearchComparison {

    //Linear Search (O(N))
   public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }

    //  Iterative Binary Search (O(log N))
   public  static int binarySearchIterative(int[] arr, int target) {


        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid; // Found
            else if (arr[mid] < target) left = mid + 1; // Search right half
            else right = mid - 1; // Search left half
        }
        return -1; // Not found
    }

      public   static double[] compare(int size){
            int[] data = new int[size]; // Creating  array
            double[] output = new double[2];
            for(int i =0; i<size; i++){
                data[i] = i;
            } int target = size-1; // Pick a random element as the search target

            // Linear Search Performance
            long start = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - start;

            // Sorting before Binary Search (O(N log N))
            Arrays.sort(data);

            // Custom Iterative Binary Search Performance
            start = System.nanoTime();
            binarySearchIterative(data, target);
            long binaryIterTime = System.nanoTime() - start;

            output[0] = linearTime / 1_000_000.0;
            output[1] = binaryIterTime / 1_000_000.0;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + output[0] + " ms");
            System.out.println("Binary Search Time: " + output[1] + " ms");
            System.out.println("---------------------------------");
                return output;

        }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000}; // Dataset sizes

        for (int N : sizes) {
            compare(N);
        }
    }
}
