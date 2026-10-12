package com.julrougens.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TutoringQueue {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Serve students in arrival order");
        {
            Queue<String> waiting = new ArrayDeque<>();
            waiting.offer("A104");
            waiting.offer("B207");
            waiting.offer("C310");
            System.out.println("Waiting list: " + waiting);
            System.out.println("Waiting: " + waiting.size());
            waiting.poll();
            System.out.println("Waiting list after update: " + waiting);
            waiting.offer("D415");
            System.out.println("Waiting list: " + waiting);
            while (!waiting.isEmpty()) {
                if (waiting.peek() == null) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Item: " + waiting.poll());
                }
            }
            System.out.println("Final " + waiting.size() + " items");
        }

//        Task 2
            System.out.println("\nUse both ends and priority order");
        {
            Deque<String> waiting = new ArrayDeque<>();
            waiting.offerLast("A104");
            waiting.offerLast("B207");
            System.out.println("Waiting list: " + waiting);
            waiting.offerFirst("R001");
            System.out.println("Waiting list after update: " + waiting);
            System.out.println("Waiting list after update: " + waiting.peekFirst());
            System.out.println("Waiting list after update: " + waiting.peekLast());
            System.out.println("Waiting list after update: " + waiting.pollLast());
            System.out.println("Waiting list after update: " + waiting.pollFirst());

        }

    }


}
