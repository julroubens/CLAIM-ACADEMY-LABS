package com.julrougens.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> counts = new LinkedHashMap<>();
        System.out.println("Enter 'stop' to end registration");
        int i = 1;
        while (true) {
            System.out.print("Enter session " + i + ": ");
            String session = scanner.nextLine();

            if (session.equalsIgnoreCase("stop")) {
                break;
            }else {
                i++;
                int previous = counts.getOrDefault(session, 0);
                counts.put(session, previous + 1);

            }
        }

        System.out.println(counts);
    }
}
