package com.julrougens.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    int [] scores = {83, 70, 90, 66};

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Ben");
        names.add("Chloe");



        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names);

        System.out.println("Size= " + names.size());

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Banana");
        names2.add("Banana");
        names2.add("Banana");
        names2.add("Banana");
        names2.add("Apple");

        System.out.println("Original Names: " + names2);
        names2.removeIf(name -> name.equalsIgnoreCase("banana"));

        System.out.println("Original Names2: " + names2);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        int highest = numbers.get(0);
        for (Integer number : numbers) {
            if (highest < number) {
                highest = number;
            }
        }
        System.out.println(highest);

        System.out.println(numbers);
        if (numbers.isEmpty()){
            System.out.println("Empty");
        }
        else {
            System.out.println("Size: " + numbers.size());
        }

    }
}
