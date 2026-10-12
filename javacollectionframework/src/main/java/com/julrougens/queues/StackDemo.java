package com.julrougens.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Banana");
        stack.push("Mango");
        System.out.println("Original stack: " + stack);
        System.out.println("Peek stack: " + stack.peek());
        System.out.println("Popping stack: " + stack.pop());
        System.out.println("Final: " + stack);

        Deque<String> deque = new ArrayDeque<>();
        deque.push("Banana");
        deque.push("Mango");
        System.out.println("Original deque: " + deque);
        System.out.println("Peek deque: " + deque.peek());
        System.out.println("Popping deque: " + deque.pop());
        System.out.println("Final: " + deque);

        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        int value = numbers.poll();
        System.out.println("Peek number: " + value);
//        if (next = null) {
//
//        }
    }
}
