package com.julrougens.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("A101", "Jules");
        students.put("A102", "Jules");
        students.put("A103", "Reggie");
        students.put("A104", "Scarlet");
        int size = students.size();
        System.out.println("Size of students: "+size);
        System.out.println("Students: "+students);
        String keys = "";

        System.out.println("Keys in students: "+keys);


//        for (Map.Entry<String, String> entry : students.entrySet()) {
//            System.out.println("Student "+entry.getKey()+" : "+entry.getValue());
//        }
//
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        List<String> names = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            names.add(i+"Claim");
//        }
//
//        Map<Integer,String> idNames = new HashMap<>();
//        for (int i = 1; i <= 10; i++) {
//            idNames.put(numbers.get(i-1),names.get(i-1));
//        }
//
//        for (Map.Entry<Integer,String> entry : idNames.entrySet()) {
//            System.out.println("Student "+entry.getKey()+" : "+entry.getValue());
//        }

    }
}
