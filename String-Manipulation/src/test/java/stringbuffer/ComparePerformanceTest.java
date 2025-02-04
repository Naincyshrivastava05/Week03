package stringbuffer;
import  static  org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;
public class ComparePerformanceTest {
    @Test
            public void test(){
    long[] arr = ComparePerformance.compare("Naincy");
    assertTrue(arr[0]<arr[1]);
    }
}

