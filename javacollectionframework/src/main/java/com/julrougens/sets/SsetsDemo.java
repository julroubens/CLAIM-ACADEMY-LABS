package com.julrougens.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SsetsDemo {
    public static void main(String[] args) {
        ArrayList<String> attempts = new ArrayList<>();
        attempts.add("A104");
        attempts.add("B207");
        attempts.add("A104");
        attempts.add("C310");
        System.out.println(attempts.size());
        System.out.println(attempts);

        Set<String> registered = new HashSet<>(attempts);
        System.out.println(registered.size());
        System.out.println(registered);

    }
}
