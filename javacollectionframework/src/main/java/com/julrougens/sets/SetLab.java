package com.julrougens.sets;

import java.util.*;

public class SetLab {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Task 1 Predict the behavior 15 points");
        {
            Set<String> skills = new HashSet<>();
            System.out.println(skills.add("Java"));
            System.out.println(skills.add("SQL"));
            System.out.println(skills.add("Java"));
            System.out.println(skills.contains("Java"));
            System.out.println(skills.remove("Python"));
            System.out.println(skills.size());
        }

//        Task 2
        System.out.println("\nTask 2 Register unique badges 30 points");
        {
            String[] scans = {"B12", "A05", "B12", "C20", "A05", "D09"};
            HashSet<String> badges = new HashSet<>();
            int count = 0;
            for (String item : scans) {
                if (badges.contains(item)) {
                    count++;
                   System.out.println("Already add " + item);
                }else {
                    badges.add(item);
                }
            }
            System.out.println("Rejected attempts: "+count);
            System.out.println("" + badges);

            badges.remove("A05");
            System.out.println("New List before remove: "+badges);

            System.out.println("Try to remove X99: "+badges.remove("X99"));

            System.out.println("Final membership: "+badges);
            /*
            In your answer file, explain why the number of scans is different from the number of attendees. Explain why a
            HashSet printout cannot be required to match one exact sequence.
            Because we made an exception before we added the number and HashSet does not support duplicate values.
             */
        }

//        Task 3
        System.out.println("\nTask 3 Compare three order policies 25 points");
        {
            int[] list = {30, 10, 20,10};
             HashSet<Integer> badges = new HashSet<>();
            LinkedHashSet<Integer> badges2 = new LinkedHashSet<>();
            TreeSet<Integer> badges3 = new TreeSet<>();

            for (int i : list) {
                badges.add(i);

            }
            System.out.println("HashSet" + badges);
            System.out.println("HashSet" + badges.size());

            for (int i : list) {
                badges2.add(i);
            }
            System.out.println("LinkedHashSet: " + badges2);
            System.out.println("LinkedHashSet: " + badges2.size());
            badges2.remove(10);
            System.out.println("LinkedHashSet after removed 10: " + badges2);
            badges2.add(10);
            System.out.println("LinkedHashSet after added 10: " + badges2);

            for (int i : list) {
                badges3.add(i);
            }
            System.out.println("TreeSet: " + badges3);
            System.out.println("TreeSet: " + badges3.size());


        }

//        Task 4
        System.out.println("\nTask 4 Compare two club rosters 30 points");
        {
            LinkedHashSet<String> arts = new LinkedHashSet<>();
            arts.add("S01");
            arts.add("S02");
            arts.add("S03");

            LinkedHashSet<String> musics = new LinkedHashSet<>();
            musics.add("S02");
            musics.add("S04");

            Set<String> eitherClubs = new LinkedHashSet<>(arts);
            eitherClubs.addAll(musics);
            System.out.println("Either club: " + eitherClubs);

            Set<String> bothClubs = new LinkedHashSet<>(arts);
            bothClubs.retainAll(musics);
            System.out.println("Both clubs: " + bothClubs);

            Set<String> artOnly = new LinkedHashSet<>(arts);
            artOnly.removeAll(musics);
            System.out.println("Art only: " + artOnly);

            System.out.println("Original art: " + arts);
            System.out.println("Original music: " + musics);

        }

    }
}
