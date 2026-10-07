package com.julrougens.linkedlist;

import java.util.LinkedList;

public class LinkedListHomeWork {
    public static void main(String[] args) {
//        Task A
        System.out.println("Part A Trace and explain 20 points");
        LinkedList<String> stops = new LinkedList<>();
        stops.add("Depot");                         //A
        stops.add("Library");                       //B
        stops.addFirst("Office");                //C
        stops.add(2, "Cafe");         //D
        stops.set(1, "Warehouse");                  //E
        stops.remove("Library");                 //F
        System.out.println(stops);


    }
}
