package com.julrougens.arraylist.arraylistlab;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreAnalyzer {

    public static void main(String[] args) {

//        Task 1
        System.out.println("Task 1: Create the original score list");
        ArrayList<Integer> scores = new ArrayList<>();
        int[] list = {78, 92, 65, 88, 54, 100, 73, 88};
        for (int value : list)
        {
            scores.add(value);
        }
        System.out.println("Original Scores: " + scores);
        System.out.println("Number of Scores = " + scores.size());

//        Task 2
        System.out.println("\nTask 2: Create the original score list");
        for (int i = 1; i < scores.size(); i++) {
            System.out.println("Student "+ i  +" : " + scores.get(i));
        }

//        Task 3
        System.out.println("\nTask 3: Calculate the total and average");
        if (true) {
//            System.out.println("Number of Student " + scores.size() + " : " + scores.toString());
            int sum = 0;
            for (int i : scores) {
                sum += i;
            }
            System.out.println("Total: " + sum);

            double average = (double) sum / scores.size();
            System.out.println("Average: " + average);
        }else {
            System.out.println("Average: N/A");
        }

//        Task 4
        System.out.println("\nTask 4: Find the highest and lowest scores");
        if (!scores.isEmpty()) {
            int max = scores.get(0);

            for (int i = 1; i < scores.size(); i++) {
                if (scores.get(i) > max) {
                    max = scores.get(i);
                }
            }
            System.out.println("Highest score: " + max);

            int min = scores.get(0);

            for (int i = 1; i < scores.size(); i++) {
                if (scores.get(i) < min) {
                    min = scores.get(i);
                }
            }
            System.out.println("Lowest score: " + min);
        }else  {
            System.out.println("Highest score: N/A");
            System.out.println("Lowest score: N/A");

        }


//        Task 5
        System.out.println("\nTask 5: Create a passing-score list");
        ArrayList<Integer> passingScores = new ArrayList<>();
        int passingCount = 0;
        for (int value : scores) {
            if (value > 70)
            {
                passingCount++;
                passingScores.add(value);
            }
        }

        int failureCount = scores.size() - passingCount;
        System.out.println("Passing Scores: " + passingScores );
        System.out.println("Passing count: " + failureCount);
        System.out.println("Passing count: " + passingCount);


//        Task 6
        System.out.println("\nTask 6: Search for a score");
        boolean result = scores.contains(100) ? true : false;
        System.out.println("Contains 100? " + result);

        int firstIndex = scores.indexOf(88);
        System.out.println("First index of 88 " + firstIndex);

        int lastIndex = scores.lastIndexOf(88);
        System.out.println("Last index of 88: " + lastIndex);

        int count = 0;
        for (int value : scores) {
            if (value == 88) {
                count++;
            }
        }
        System.out.println("Occurrences of 88: " + count);


//        Task 7
        System.out.println("\nTask 7: Sort a separate copy");
        ArrayList<Integer>  sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores);
        System.out.println("Sorted scores: " + sortedScores);
        System.out.println("Original Scores: " + scores);


//        Task 8
        System.out.println("\nTask 8: Apply bonus points to another copy");
        ArrayList<Integer> bonusScores = new ArrayList<>(scores);
        for (int i = 0; i < bonusScores.size(); i++) {
            bonusScores.set(i, bonusScores.get(i) + 5);
        }

        System.out.println("Bonus Scores: " + bonusScores);
        System.out.println("Original Scores: " + scores);

    }
}
