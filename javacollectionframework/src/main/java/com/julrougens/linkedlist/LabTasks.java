package com.julrougens.linkedlist;

import java.util.*;

public class LabTasks {
    public static void main(String[] args) {
        System.out.println("Task 1");
        {
            LinkedList<String> pets = new LinkedList<>();
            pets.add("Cat");
            pets.add("Dog");
            pets.addFirst("Bird");
            pets.set(1, "Fish");
            pets.removeLast();
            System.out.println(pets);
            System.out.println(pets.size());
        }

        System.out.println("Task 2");
        {
            LinkedList<String> playlist = new LinkedList<>();
            playlist.add("Focus");
            playlist.add("Break");
            playlist.add("Review");
            System.out.println("Playlist 1: " + playlist);
            playlist.addFirst("Welcome");
            playlist.addLast("Goodbye");
            System.out.println("Playlist 2: " + playlist);
            playlist.add(3, "Question");
            playlist.set(1, "Patrice");
            System.out.println("Playlist 3: " + playlist);
            playlist.remove("Review");
            System.out.println("Playlist 4: " + playlist);
            System.out.println("Playlist 5: " + playlist.getFirst());
            System.out.println("Playlist 6: " + playlist.getLast());
            System.out.println("Playlist 7: " + playlist.size());
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println(i+ ". "+ playlist.get(i)+"\n");
            }
        }
        System.out.println("Task 3");
        {
            LinkedList<Integer> tickets = new LinkedList<>();
            int[] list = {101, 202, 303, 202};
            for (int item : list) {
                tickets.add(item);
            }

            System.out.println("Tickets: " + tickets);
            tickets.remove(1);
            System.out.println("After removing index 1: " + tickets);
            tickets.remove(Integer.valueOf(202));
            System.out.println("After removing value 202: " + tickets);
            boolean result = tickets.contains(999);
            System.out.println("Removed 999: " + result);
            System.out.println("Final tickets: "+ tickets);
        }

        System.out.println("Task 4");
        {
            LinkedList<Integer> stock = new LinkedList<>();
            int[] list = {4, 0, 7, 0, 2};
            for (int item : list) {
                stock.add(item);
            }
            System.out.println("Original stock: " + stock);

            Iterator<Integer> iterator = stock.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() == 0) {
                    iterator.remove();
                }
            }
            System.out.println("Remaining stock: " + stock);

            int count = 0;
            for (Integer integer : stock) {
                int result = integer % 2;
                if (result == 0) {
                    count++;
                }
            }
            System.out.println("Removed entries: " + count);

            int sum = 0;
            for (Integer integer : stock) {
                sum += integer;
            }
            System.out.println("Total items: " + sum);

        }

        System.out.println("Task 5");
        {
            List<String> names = new LinkedList<>();

            names.add("Ava");
            names.add("Ben");
            names.add(1, "Mia");

            System.out.println(names);

            /*
                1- List is the interface. ArrayList and LinkedList are implementation classes.
                2- Both versions support add() and get() because both ArrayList and LinkedList implement the List interface.
                3- ArrayList is usually a better starting point for frequent reads by index because it can access an element directly by its index.
                4- Saying "LinkedList is always faster for insertion" is incomplete because the program may first need to traverse the list to find the
                insertion position. Finding that position can take time, especially when inserting by index.

             */
        }
    }
}
