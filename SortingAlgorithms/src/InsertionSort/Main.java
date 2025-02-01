package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] employeeIds = {11, 2, 5, 9, 10, 3}; // Unsorted employee IDs
        System.out.println("Unsorted Employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        // Call the insertion sort function
        InsertionSort.insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
