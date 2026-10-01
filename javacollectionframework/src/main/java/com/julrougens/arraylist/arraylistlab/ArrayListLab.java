package com.julrougens.arraylist.arraylistlab;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLab {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Part 1: Manage a Class Roster — 20 points");
        ArrayList<String> names = new ArrayList<>();
        String[] namesArray = {"Ben", "Ada", "Micheal", "Naomi"};
        for (String name : namesArray) {
            names.add(name);
        }
        System.out.println("List of names: " + names);
        System.out.println("List of names: " + names.size());

        String lastIndex = names.get(names.size() - 1);
        System.out.println("Last Index: " + lastIndex);
        System.out.println("Last name: " + names.getLast());
        names.addFirst("Moses");
        names.add("Joshua");
        System.out.println("List of names: " + names);
        System.out.println("Name: " + names.get(3));
        names.remove(names.size() - 1);
        System.out.println("List of names update: " + names);

//        Task 2
        System.out.println("\nPart 2: Remove Duplicate Values — 15 points");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println("List of fruit: " + fruits);
        fruits.remove("Banana");
        System.out.println("List of fruits updated: " + fruits);
        int count = 0;
        for (String fruit : fruits) {
            if (fruit.equals("Banana")) {
                count++;
            }
        }
        System.out.println("Number of Bananas: " + count);

        fruits.removeIf(fruit -> fruit.equals("Banana"));
        System.out.println("List of fruits updated: " + fruits);

//        Task 3
        System.out.println("\nPart 3: Index or Value? — 15 points");
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] list = {10, 20, 30, 20};
        for (int number : list) {
            numbers.add(number);
        }
        System.out.println("List of numbers: " + numbers);
        numbers.remove(1);
//        The result will be [10, 30, 20]
        System.out.println("List of numbers updated: " + numbers);

        numbers.remove(Integer.valueOf(20));
//        The result will [10, 30]
        System.out.println("List of numbers updated: " + numbers);
        numbers.remove(Integer.valueOf(99));
//        The result will [10, 30]
        System.out.println("List of numbers updated: " + numbers);

//        Task 4
        System.out.println("\nPart 4: Search and Traverse — 20 points");
        ArrayList<String> students = new ArrayList<>();
        String[] listStudent = {"Ada", "Ben", "John", "Ben"};
        for (String student : listStudent) {
            students.add(student);
        }
        System.out.println("List of students: " + students);
        System.out.println("Contains: "+students.contains("Ben"));
        System.out.println("Index of: "+students.indexOf("Ben"));
        System.out.println("Index of: "+students.lastIndexOf("Ben"));
        System.out.println("Index of: "+students.indexOf("Zoe"));
        System.out.println("List of students: " + students);

        students.add("Jules");
        System.out.println("List of students: " + students);
        students.add(2, "Jules");
        for (int i = 1; i < students.size(); i++) {
            System.out.println(i+ " : "+ students.get(i));
        }

//        Task 5
        System.out.println("\nPart 5: Analyze Scores — 30 points");
        ArrayList<Integer> scores = new ArrayList<>();
        int[] listScores = {80, 90, 105, 88, 98};
        for (int score : listScores) {
            scores.add(score);
        }
        System.out.println("List of scores: " + scores);
        int total = 0;
        int highest = 0;
        double average = 0;
        if (scores.isEmpty()) {
            System.out.println("No scores available.");
        }else  {
            for (Integer score : scores) {
                total = total + score;
            }
            System.out.println("Total score is " + total);
            average = (double)total / scores.size();
            System.out.println("Average score: " + average);
            for (int value : scores) {
                if (value > highest) {
                    highest = value;
                }
            }
            System.out.println("Highest score: " + highest);


        }

    }
}
