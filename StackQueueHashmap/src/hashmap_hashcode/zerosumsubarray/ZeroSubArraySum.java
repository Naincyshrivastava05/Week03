package hashmap_hashcode.zerosumsubarray;
import java.util.*;

 public class ZeroSubArraySum {

    public static List<List<Integer>> zeroSubarray(int[] arr) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if(sum == 0){
                list.add(getSubArray(arr, 0, i));
            }

            if(map.containsKey(sum)){
                List<Integer> indeces = map.get(sum);
                for(int index: indeces){
                    list.add(getSubArray(arr, index+1, i));
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return list;
    }
    public static List<Integer> getSubArray(int[] arr, int start, int end){
        List<Integer> list = new ArrayList<>();
        for(int i =start; i<=end; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
