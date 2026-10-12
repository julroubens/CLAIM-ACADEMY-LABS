package com.julrougens.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        counts.put("SQL", 2);
        counts.put("Java", 2);
        counts.put("HTML", 1);
        counts.put("SQL", 3);
        System.out.println(counts);

        Map<String, Integer> countSorted = new TreeMap<>(counts);
        System.out.println("Sorted: " + countSorted);

        counts.remove("SQL");
        counts.put("SQL", 3);
        System.out.println(counts);

        System.out.println(counts.getOrDefault("Python", 8));
    }
}
