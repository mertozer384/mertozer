package collection_review;

import java.util.Stack;

public class StackReview {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //LIFO
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
    }
}
