package stackandqueue;

import java.util.Stack;

public class QueUsingStack {
    private Stack<Integer> stack1; // Used for enqueue operation
    private Stack<Integer> stack2; // Used for dequeue operation

    public QueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int item) {
        stack1.push(item);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Dequeue from an empty queue");
        }
        // Pop the top element from stack2 (front of the queue)
        return stack2.pop();
    }

    // Peek operation
    public int peek() {
        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Peek from an empty queue");
        }
        // Return the top element from stack2 (front of the queue)
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    // Main method for testing
    public static void main(String[] args) {
        QueUsingStack queue = new QueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek());    // Output: 2
        System.out.println(queue.size());    // Output: 2
        System.out.println(queue.isEmpty()); // Output: false

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.isEmpty()); // Output: true
    }
}

