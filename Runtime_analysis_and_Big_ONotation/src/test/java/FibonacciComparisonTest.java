import static org.junit.jupiter.api.Assertions.*;
import feboncacciseries.FibonacciComparision;
import org.junit.jupiter.api.Test;

class FibonacciComparisonTest {

    @Test
    void testFibonacciRecursive() {
        assertEquals(0, FibonacciComparision.fibonacciRecursive(0));
        assertEquals(1, FibonacciComparision.fibonacciRecursive(1));
        assertEquals(1, FibonacciComparision.fibonacciRecursive(2));
        assertEquals(2, FibonacciComparision.fibonacciRecursive(3));
        assertEquals(3, FibonacciComparision.fibonacciRecursive(4));
        assertEquals(5, FibonacciComparision.fibonacciRecursive(5));
        assertEquals(8, FibonacciComparision.fibonacciRecursive(6));
        assertEquals(13, FibonacciComparision.fibonacciRecursive(7));
    }

    @Test
    void testFibonacciIterative() {
        assertEquals(0, FibonacciComparision.fibonacciIterative(0));
        assertEquals(1, FibonacciComparision.fibonacciIterative(1));
        assertEquals(1, FibonacciComparision.fibonacciIterative(2));
        assertEquals(2, FibonacciComparision.fibonacciIterative(3));
        assertEquals(3, FibonacciComparision.fibonacciIterative(4));
        assertEquals(5, FibonacciComparision.fibonacciIterative(5));
        assertEquals(8, FibonacciComparision.fibonacciIterative(6));
        assertEquals(13, FibonacciComparision.fibonacciIterative(7));
    }

    @Test
    void testPerformance() {
        long startRecursive = System.nanoTime();
        FibonacciComparision.fibonacciRecursive(10);  // Small N for recursion
        long endRecursive = System.nanoTime();
        long timeRecursive = (endRecursive - startRecursive) / 1_000_000; // Convert to ms

        long startIterative = System.nanoTime();
        FibonacciComparision.fibonacciIterative(50);  // Large N for iteration
        long endIterative = System.nanoTime();
        long timeIterative = (endIterative - startIterative) / 1_000_000; // Convert to ms

        System.out.println("Recursive Time (N=10): " + timeRecursive + " ms");
        System.out.println("Iterative Time (N=50): " + timeIterative + " ms");

        assertTrue(timeIterative < timeRecursive, "Iterative should be faster than Recursive");
    }
}
