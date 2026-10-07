package com.julrougens.sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomework {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Part A Trace before running 15 points");
        {
            Set<String> visits = new LinkedHashSet<>();
            visits.add("B20");
            visits.add("A10");
            visits.add("C30");
            System.out.println(visits.add("B20"));
            System.out.println(visits);
            visits.remove("B20");
            visits.add("B20");
            System.out.println(visits);
            System.out.println(new TreeSet<>(visits));
        }

//        Task 2
        System.out.println("\nPart B Workshop registration report 45 points");
        {
            String[] javaAttempts = {"S104", "S102", "S104", "S101", "S103", "S102"};
            String[] webAttempts = {"S103", "S105", "S102", "S105", "S106"};

            LinkedHashSet<String> jAttempts = new LinkedHashSet<>();
            LinkedHashSet<String> wAttempts = new LinkedHashSet<>();
            int countJava = 0;
            int countWeb = 0;
            for (String attempt : javaAttempts) {
                if (!jAttempts.contains(attempt)) {
                    jAttempts.add(attempt);
                }else {
                    countJava++;
                }

            }
            System.out.println("Java accepted: "+jAttempts);
            System.out.println("Java unique: " + jAttempts.size());
            System.out.println("Java duplicate attempts:" + countJava);

            for (String attempt : webAttempts) {
                countWeb++;
                if (!wAttempts.contains(attempt)) {
                    wAttempts.add(attempt);
                }else  {
                    countWeb++;
                }
            }
            System.out.println("Web accepted: " + wAttempts);
            System.out.println("Web unique: " + wAttempts.size());
            System.out.println("Web duplicate attempts: "+countWeb);

            Set<String> combine = new LinkedHashSet<>(jAttempts);
            combine.addAll(wAttempts);
            System.out.println("All registrants: "+combine);

            Set<String> both = new LinkedHashSet<>(jAttempts);
            both.retainAll(wAttempts);
            System.out.println("Shared: "+both);

            Set<String> onlyJava = new LinkedHashSet<>(jAttempts);
            onlyJava.removeAll(wAttempts);
            System.out.println("Only Java: "+onlyJava);
            Set<String> onlyWeb = new LinkedHashSet<>(wAttempts);
            onlyWeb.removeAll(jAttempts);
            System.out.println("Only Web: "+onlyWeb);

            TreeSet<String> sorted = new TreeSet<>(jAttempts);
            sorted.addAll(wAttempts);
            System.out.println("Sorted: "+sorted);


        }
    }
}
