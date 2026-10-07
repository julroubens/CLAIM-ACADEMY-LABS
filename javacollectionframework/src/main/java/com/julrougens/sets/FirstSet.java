package com.julrougens.sets;

import java.util.HashSet;
import java.util.Set;

public class FirstSet {
    public static void main(String[] args) {
        HashSet<String> topics = new HashSet<>();
        topics.add("JAVA");
        topics.add("SQL");
        topics.add("JAVA");
        topics.add("Python");
        topics.add("PHP");

        System.out.println(topics);

        Set<Integer> seats = new HashSet<>();
        seats.add(10);
        seats.add(20);
        seats.add(30);
        System.out.println(seats.contains(20));
        System.out.println(seats.remove(20));
        System.out.println(seats.contains(20));
        System.out.println(seats.remove(99));


    }
}
