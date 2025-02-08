package sorting_in_large_dataset;


    import java.util.Arrays;
import java.util.Random;


public class CompareSorting {
        // Bubble Sort
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
            boolean bool = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        bool = true;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                if(bool == false){
                    break;
                }
            }
        }

        // Merge Sort
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];

            System.arraycopy(arr, left, leftArr, 0, n1);
            System.arraycopy(arr, mid + 1, rightArr, 0, n2);

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArr[i] <= rightArr[j]) {
                    arr[k++] = leftArr[i++];
                } else {
                    arr[k++] = rightArr[j++];
                }
            }
            while (i < n1) arr[k++] = leftArr[i++];
            while (j < n2) arr[k++] = rightArr[j++];
        }

        // Quick Sort
        public static void quickSort(int[] arr, int low, int high) {
            if(low>=high) return;

                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);

        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }


        public static double[] compare(int size){
        int[] data = new int[size]; // Creating  array
        double[] output = new double[3];
        for(int i =0; i<size; i++){
            data[i] = i;
        }
        int target = size-1;

        // Bubble Sort Performance
        long start = System.nanoTime();
        bubbleSort(data);
        long bubbleTime = System.nanoTime() - start;



        //  merge sort Performance
        start = System.nanoTime();
        mergeSort(data, 0, data.length-1);
        long mergeTime = System.nanoTime() - start;

        //  quicke sort Performance
        start = System.nanoTime();
        quickSort(data, 0, data.length-1);
        long quickTime = System.nanoTime() - start;

        output[0] = bubbleTime / 1000000.0;
        output[1] = mergeTime / 1000000.0;
        output[2] = quickTime/1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("bubble sort Time: " + output[0] + " ms");
        System.out.println("Merge sort Time: " + output[1] + " ms");
        System.out.println("quick sort Time: " + output[2] + " ms");
        System.out.println("---------------------------------");
        return output;
    }

    public static void main(String[] args) {
        int[] sizes = {1000,10000};
        for(int size:sizes){
            compare(size);
        }
    }
    }


