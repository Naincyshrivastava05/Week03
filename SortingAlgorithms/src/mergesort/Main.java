package mergesort;

public class Main {
    public static void main(String[] args) {
        int[] bookPrices = {45, 23, 10, 78, 50, 15};
        System.out.println("Unsorted Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }

        MergeSort.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("\nSorted Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
