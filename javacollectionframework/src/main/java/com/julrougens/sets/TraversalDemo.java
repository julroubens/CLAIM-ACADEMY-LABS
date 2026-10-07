package com.julrougens.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TraversalDemo {
    public static void main(String[] args) {
        Set<Integer> quantity = new LinkedHashSet<>();
        quantity.add(4);
        quantity.add(0);
        quantity.add(7);

        System.out.println("Quantity: "+quantity);

        Iterator<Integer> iterator = quantity.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 0) {
                iterator.remove();
            }

        }
        System.out.println("Quantity: "+quantity);
    }
}
