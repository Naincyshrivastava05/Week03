package hashmap_hashcode.zerosumsubarray;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int [] arr = {6,-1,-3,4,-2,2,4,6};
        List<List<Integer>> ans = ZeroSubArraySum.zeroSubarray(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
}
