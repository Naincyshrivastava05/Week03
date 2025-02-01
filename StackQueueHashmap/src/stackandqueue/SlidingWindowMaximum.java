package stackandqueue;
import java.util.*;
public class SlidingWindowMaximum {

        public static int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if(k==0) return new int[0];

            int[] result = new int[n-k+1];
            Deque<Integer> deq = new LinkedList<>();

            for(int i =0; i<n; i++){

                //1
                while(!deq.isEmpty() && deq.peek()<i-k+1){
                    deq.poll();
                }
                //2
                while(!deq.isEmpty() && nums[deq.peekLast()]<=nums[i]){
                    deq.pollLast();
                }
                //3
                deq.offer(i);
                //4
                if(i>=k-1){
                    result[i-k+1] = nums[deq.peek()];
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums = {4,6,1,9,3,2};
        int k = 2;
        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
    }

