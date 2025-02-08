import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import search_in_large_dataset.SearchComparison;


public class SearchComparisonTest {
    @Test
     void linearBinary(){
        int[] sizes = {1000,10000,1000000};
        for(int size:sizes) {
            double[] ans = SearchComparison.compare(size);
        assertEquals(ans[0]>ans[1],true);
        }

    }
}
