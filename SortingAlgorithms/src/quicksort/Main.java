package quicksort;

public class Main {
    public static void main(String[] args) {
        int[] productPrices = {120, 45, 80, 30, 90, 10};
        System.out.println("Unsorted Product Prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }

       QuickSort.quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nSorted Product Prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
