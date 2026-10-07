package com.julrougens.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class CombineTwoGroups {
    public static void main(String[] args) {
        Set<String> coding = new LinkedHashSet<>();
        coding.add("Ava");
        coding.add("Ben");
        coding.add("Mia");

        Set<String> robotics = new LinkedHashSet<>();
        robotics.add("Ben");
        robotics.add("Noah");

        Set<String> either = new LinkedHashSet<>();
        either.addAll(coding);
        either.addAll(robotics);
        System.out.println("Combined: "+either);

        Set<String> both = new LinkedHashSet<>(coding);
//        both.retainAll(coding);
        both.retainAll(robotics);
        System.out.println("Combined: "+both);

    }
}
