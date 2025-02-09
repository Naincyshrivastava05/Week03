package feboncacciseries;

public class FibonacciComparision {

    // Recursive Fibonacci (Exponential Time Complexity: O(2^N))
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (Linear Time Complexity: O(N))
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // Performance Comparison
    public static void main(String[] args) {
        int n = 30; // Change this for different values

        // Measuring Recursive Approach Time
        long startRecursive = System.nanoTime();
        int resultRecursive = fibonacciRecursive(n);
        long endRecursive = System.nanoTime();
        long timeRecursive = (endRecursive - startRecursive) / 1_000_000; // Convert to milliseconds

        // Measuring Iterative Approach Time
        long startIterative = System.nanoTime();
        int resultIterative = fibonacciIterative(n);
        long endIterative = System.nanoTime();
        long timeIterative = (endIterative - startIterative) / 1_000_000; // Convert to milliseconds

        // Output Results
        System.out.println("Fibonacci(" + n + ") = " + resultRecursive + " (Recursive) in " + timeRecursive + " ms");
        System.out.println("Fibonacci(" + n + ") = " + resultIterative + " (Iterative) in " + timeIterative + " ms");
    }
}

