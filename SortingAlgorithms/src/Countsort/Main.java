package Countsort;

public class Main {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 16};
        System.out.println("Unsorted Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        CountSort.countingSort(ages);

        System.out.println("\nSorted Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
