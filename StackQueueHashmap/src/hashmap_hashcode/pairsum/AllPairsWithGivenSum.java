package hashmap_hashcode.pairsum;

import java.util.HashMap;

public class AllPairsWithGivenSum {
    public static void pairSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:  arr){
            int complement  = target-num;
            if(map.containsKey(complement)){
                int count = map.get(complement);
                for(int i =0; i<count; i++){
                    System.out.println("Target-"+target+" pair:-("+num+","+complement+")");
                }
            }
            map.put(num, map.getOrDefault(num,0)+1);
        }

    }
}
