package com.julrougens.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstQueue {
    public static void main(String[] args) {
        Queue<String> waiting = new ArrayDeque<>();
        System.out.println(waiting.offer("A104"));
        waiting.offer("B207");
        waiting.offer("C310");
        waiting.add("D105");
        System.out.println("Next peek: " + waiting.peek());

    }
}
