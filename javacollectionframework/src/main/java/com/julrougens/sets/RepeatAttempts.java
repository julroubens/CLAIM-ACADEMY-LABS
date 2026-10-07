package com.julrougens.sets;

import java.util.HashSet;
import java.util.Set;

public class RepeatAttempts {
    public static void main(String[] args) {

        String[] scans = {"A104","B207", "C310", "A104"};
        Set<String> admitted = new HashSet<>();
        int repeatAttempts = 0;
        for (String id : scans) {
            if (!admitted.add(id)) {
                repeatAttempts++;
                System.out.println("Already admitted: " + id);
            }
        }
        System.out.println(admitted);
     }
}
