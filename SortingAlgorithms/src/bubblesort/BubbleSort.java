package bubblesort;



public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            boolean swap = false;
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }
    public static void swap(int [] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
