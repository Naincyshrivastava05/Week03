package heapsort;

public class Main {
    public static void main(String[] args) {
        int[] salaries = {50000, 45000, 60000, 55000, 40000};
        System.out.println("Unsorted Salaries:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

     HeapSort.heapSort(salaries);

        System.out.println("\nSorted Salaries:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}
