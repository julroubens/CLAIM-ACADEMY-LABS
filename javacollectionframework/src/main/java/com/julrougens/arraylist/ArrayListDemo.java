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


    }

}
