package com.julrougens.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentDirectory {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("A104 ", "Ava");
        students.put("B207", "Ben");
        students.put("C310", "Ava");
//        Task 1
        System.out.println("Task 1: insert, look up, and update (25 points)");
        {

            System.out.println("Student size" + students.size());
            System.out.println("Student names: " + students);

            System.out.println("Student name: " + students.get("B207"));
            students.put("B207", "Benjamin");
            System.out.println("Student names update: " + students);
            System.out.println("containsKey(\"C310\"): " + students.containsKey("C310"));
            System.out.println("containsValue(\"Ava\"): " + students.containsValue("Ava"));
            System.out.println("containsValue(\"Z999\"): " + students.containsValue("Z999"));
            System.out.println(students.remove("A104"));
            System.out.println(students.remove("A104"));
            System.out.println("Final size: " + students.size());
        }

//        Task 2
        System.out.println("\nTask 2: report entries (10 points)");
        {
            for (Map.Entry<String, String> entry : students.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        }

//        Task 3
        System.out.println("\nCount workshop requests");

            String[] requests = {
                    "SQL", "Java", "SQL", "HTML", "Java", "SQL", "CSS"
            };

            LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

            for (String request : requests) {
                int currentCount = counts.getOrDefault(request, 0);
                counts.put(request, currentCount + 1);
            }

            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            int totalRequests = 0;

            for (int count : counts.values()) {
                totalRequests += count;
            }

            int distinctTopics = counts.size();
            int repeatedAttempts = totalRequests - distinctTopics;

            System.out.println("Total requests: " + totalRequests);
            System.out.println("Distinct topics: " + distinctTopics);
            System.out.println("Repeated attempts: " + repeatedAttempts);


//        Task 4
        System.out.println("\nCompare order and test edge cases");
        {
            String[] reqs = {"SQL", "Java", "SQL", "HTML", "Java", "SQL", "CSS"};
//            TreeMap<String,  Integer> treeMap = new TreeMap<>();
//
//            for (int i = 1; i < reqs.length; i++) {
//                treeMap.put(reqs[i], i);
//            }
//            System.out.println(treeMap);


            // TreeMap copy
            Map<String, Integer> sorted = new TreeMap<>(counts);

            System.out.println("Sorted: " + sorted);
            System.out.println("Original: " + counts);

            // HashMap copy
            Map<String, Integer> hashCopy = new HashMap<>(counts);

            System.out.println("HashMap copy: " + hashCopy);

        }
    }
}
