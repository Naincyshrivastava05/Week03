import static org.junit.jupiter.api.Assertions.*;

import datastructure_comparison.DataStructureSearchComparison;
import org.junit.jupiter.api.Test;
import java.util.*;

class DataStructureSearchComparisonTest {
    @Test
    void compare(){
        int[] sizes = {1000,10000,100000};

        for(int size: sizes){
             double[] ans = DataStructureSearchComparison.compare(size);
             assertEquals(ans[0]>ans[1],true);
            assertEquals(ans[2]>ans[1],true);
        }
    }


    @Test
    void testSearchInArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(DataStructureSearchComparison.searchInArray(array, 3));
        assertFalse(DataStructureSearchComparison.searchInArray(array, 10));
    }

    @Test
    void testSearchInHashSet() {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(DataStructureSearchComparison.searchInHashSet(set, 3));
        assertFalse(DataStructureSearchComparison.searchInHashSet(set, 10));
    }

    @Test
    void testSearchInTreeSet() {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(DataStructureSearchComparison.searchInTreeSet(set, 3));
        assertFalse(DataStructureSearchComparison.searchInTreeSet(set, 10));
    }
}
