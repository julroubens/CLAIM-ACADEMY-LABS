package com.julrougens.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegistrationReport {
    public static void main(String[] args) {
        String[] morning = {"Java", "SQL", "Java", "HTML", "SQL", "Java"};
        String[] afternoon = {"SQL", "CSS", "Java", "CSS", "Python", "SQL"};
        LinkedHashMap<String, Integer> morn = new LinkedHashMap<>();
        Map<String, Integer> aftern = new LinkedHashMap<>();

//        Task 1
        System.out.println("Build and combine session reports");
        {
            for (String s : morning) {
                morn.put(s, morn.getOrDefault(s, 0) + 1);
            }
            for (String s : afternoon) {
                aftern.put(s, aftern.getOrDefault(s, 0) + 1);
            }

            System.out.println("Morning: " + morn);
            System.out.println("Afternoon: " + aftern);

            // Afternoon count
            for (String topic : afternoon) {
                int count = aftern.getOrDefault(topic, 0);
                aftern.put(topic, count + 1);
            }

            // Morning totals
            int morningTotal = 0;

            for (int count : morn.values()) {
                morningTotal += count;
            }

            int morningDistinct = morn.size();
            int morningRepeats = morningTotal - morningDistinct;

            // Afternoon totals
            int afternoonTotal = 0;

            for (int count : aftern.values()) {
                afternoonTotal += count;
            }

            int afternoonDistinct = aftern.size();
            int afternoonRepeats = afternoonTotal - afternoonDistinct;

            System.out.println("Morning: " + morn);
            System.out.println("Distinct: " + morningDistinct );
            System.out.println("Total: " + morningTotal );
            System.out.println("Repeated attempts: " + morningRepeats);

            System.out.println("Afternoon: " + aftern);
            System.out.println("Distinct: " + afternoonDistinct);
            System.out.println("Total: " + afternoonTotal );
            System.out.println("Repeated attempts: " + afternoonRepeats );
        }

//        Task 2
        System.out.println("\nPart B: combine without losing counts (30 points)");
        {
            Map<String, Integer> combined = new LinkedHashMap<>(morn);

            for (Map.Entry<String, Integer> entry : aftern.entrySet()) {
                String topic = entry.getKey();
                int afternoonCount = entry.getValue();
                int currentCount = combined.getOrDefault(topic, 0);
                combined.put(topic, currentCount + afternoonCount);
            }

            int combinedTotal = 0;

            for (int count : combined.values()) {
                combinedTotal += count;
            }

            int combinedDistinct = combined.size();
            int combinedRepeats = combinedTotal - combinedDistinct;

            System.out.println("Combined: " + combined);
            System.out.println("Combined distinct topics: " + combinedDistinct);
            System.out.println("Combined total requests: " + combinedTotal);
            System.out.println("Combined repeated attempts: " + combinedRepeats);

            System.out.println("\nMorning: " + morn);
            System.out.println("Afternoon: " + aftern);
        }
    }
}
