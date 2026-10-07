package com.julrougens.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        {
            ArrayList<String> names = new ArrayList<>();
            names.add("Ada");
            names.add("John");
            names.add("David");
            System.out.println(names);

            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("Ada");
            linkedList.add("John");
            linkedList.add("David");

            System.out.println(linkedList);

            LinkedList<String> shoppingList = new LinkedList<>();
            shoppingList.add("Bread");
            shoppingList.add("Milk");
            shoppingList.add("Eggs");

            System.out.println(shoppingList);
            shoppingList.add(1, "Rice");
            System.out.println(shoppingList);
            shoppingList.add(3, "Jam");
            System.out.println(shoppingList);
        }

        {
            LinkedList<String> names = new LinkedList<>();
            System.out.println(names);
            names.add(0,"Julie");
            System.out.println(names);
        }
        {
            LinkedList<String> colors = new LinkedList<>();
            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");
        }


    }
}
