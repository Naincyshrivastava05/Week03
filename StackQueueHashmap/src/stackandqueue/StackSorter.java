package stackandqueue;
import java.util.*;

public class StackSorter {
    //Getting elements one by one for sorting
    public static void stackSorter(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        stackSorter(stack);
        insertSorted(stack, top);
    }
    //adding elements according to their order
    public static void insertSorted(Stack<Integer> stack, int element){
        if(stack.isEmpty()|| element>stack.peek()){
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(43);
        stack.push(56);
        stack.push(32);
        stack.push(67);
        stack.push(90);
        System.out.println("Unsorted stack"+ stack);
        stackSorter(stack);

        System.out.println("Sorted stack"+stack);
    }

}
