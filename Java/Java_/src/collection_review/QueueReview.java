package collection_review;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueReview {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(); //FIFO
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
    }
}
