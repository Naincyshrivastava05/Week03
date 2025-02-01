package hashmap_hashcode.longest_consecutive;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longest(int[] arr){
        int longest = 0;
        HashSet<Integer> set =  new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int current = 1;
                int currentnum = num;
                while(set.contains(currentnum+1)){
                    current++;
                    currentnum++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
