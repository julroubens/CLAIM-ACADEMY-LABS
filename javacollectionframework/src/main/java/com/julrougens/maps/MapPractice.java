package com.julrougens.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        String[] requests = {
                "SQL", "Java", "SQL", "HTML", "Java", "SQL"
        };
        Map<String, Integer> counts = new LinkedHashMap<>();
//        Task 1
        System.out.println("Task 1: count and summarize (10 minutes | 6 points)");
        {
            int totalRequest = 0;
            int distinct = 0;
            int repeatAttempts = 0;


            for (String request : requests) {
                counts.put(request, counts.getOrDefault(request, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {

                    repeatAttempts++;
                    totalRequest += entry.getValue();
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    distinct += counts.getOrDefault(entry, 0) + 1;
            }
            System.out.println("Distinct topics: "+ distinct);
            System.out.println("Total requests: "+totalRequest);
            System.out.println("Repeated attempts: "+repeatAttempts);
        }

//        Task 2
        System.out.println("Task 2: compare ordering (8 minutes | 6 points)");
        {
            Map<String, Integer> counts2 = new TreeMap<>(counts);
            System.out.println("Sorted: " + counts2);
            System.out.println("Original: " + counts);
        }

//        Task 3
        System.out.println("Task 3: predict, then run (9 minutes | 6 points)");
        {
            Map<String, Integer> original = new LinkedHashMap<>();
            original.put("SQL", 3);
            original.put("Java", 2);
            Map<String, Integer> copy = new LinkedHashMap<>(original);
            Map<String, Integer> alias = original;
            copy.put("SQL", 99);
            System.out.println("A: " + original.get("SQL"));
            alias.put("HTML", 1);
            System.out.println("B: " + original.containsKey("HTML"));
            Set<String> keys = original.keySet();
            original.put("CSS", 1);
            System.out.println("C: " + keys.contains("CSS"));
            keys.remove("Java");
            System.out.println("D: " + original.containsKey("Java"));
        }


    }
}
