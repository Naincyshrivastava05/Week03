package stackandqueue;
import java.util.*;
public class StockSpan {


    public static int[] span(int[] prices){
        int n =prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n; i++){
            //ckecking if the element is smaller or not
            if(!stack.isEmpty() && prices[stack.peek()]<= prices[i]){
                stack.pop();
            }
            span[i] = stack.isEmpty()?i+1:i-stack.peek();
            stack.push(i);
        }
        return  span;
    }
    public static void main(String[] args) {
        int[] price = {100,67,34,89,96,102};
        System.out.println("Prices"+Arrays.toString(price));
        int [] ans = span(price);
        System.out.println("Span"+Arrays.toString(ans));
    }
}
