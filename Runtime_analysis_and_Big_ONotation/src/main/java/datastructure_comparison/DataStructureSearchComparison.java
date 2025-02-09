package datastructure_comparison;
import java.util.*;

public class DataStructureSearchComparison {

    // Linear search in an array (O(N))
    public static boolean searchInArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Search in a HashSet (O(1) on average)
    public static boolean searchInHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Search in a TreeSet (O(log N))
    public static boolean searchInTreeSet(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }
    public static  double[] compare(int size){

        // Generating dataset
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        double[] ans = new double[3];

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
        int target = size-1;
        // Measuring Array Search
        long startArray = System.nanoTime();
        boolean foundArray = searchInArray(array, target);
        long endArray = System.nanoTime();
        ans[0] = (endArray - startArray) / 1_000_000; // Convert to milliseconds

        // Measuring HashSet Search
        long startHashSet = System.nanoTime();
        boolean foundHashSet = searchInHashSet(hashSet, target);
        long endHashSet = System.nanoTime();
       ans[1]= (endHashSet - startHashSet) / 1_000_000; // Convert to milliseconds

        // Measuring TreeSet Search
        long startTreeSet = System.nanoTime();
        boolean foundTreeSet = searchInTreeSet(treeSet, target);
        long endTreeSet = System.nanoTime();
        ans[2] = (endTreeSet - startTreeSet) / 1_000_000; // Convert to milliseconds

        // Printing results
        System.out.println("Array Search: " + ans[0] + " ms | Found: " + foundArray);
        System.out.println("HashSet Search: " + ans[1] + " ms | Found: " + foundHashSet);
        System.out.println("TreeSet Search: " + ans[2] + " ms | Found: " + foundTreeSet);
        return ans;

    }
    // Performance Comparison
    public static void main(String[] args) {
        int [] sizes = {1000,10000,100000};
        for(int size:sizes){
            compare(size);
        }
    }
}
