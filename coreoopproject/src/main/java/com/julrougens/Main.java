package com.julrougens;

import com.julrougens.inheritance.innerpackage.Goat;
import com.julrougens.inheritance.innerpackage.Bird;
import com.julrougens.inheritance.innerpackage.Cat;
import com.julrougens.inheritance.innerpackage.Dog;
import com.julrougens.inheritance.interfaces.Nest;
import com.julrougens.org.Box;
import com.julrougens.org.Person;
import com.julrougens.org.Rectangle;
import com.julrougens.org.Roster;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("James", 0);
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(person);
        System.out.println("Person name " + person.name());
        System.out.println("Person age " + person.age());

        System.out.println("Rectangle perimeter " + rectangle.perimeter());
        System.out.println("Rectangle area " + rectangle.area());

        Roster roster = new Roster(new ArrayList<>());
        roster.names().add("James");
        roster.names().add("John");

        Box<String> box = new Box<>("This is a generic types in java");
        System.out.println(box.getValue());

        Box<Integer> integerBox = new Box<>(5);
        System.out.println(integerBox.getValue());

        Box<Boolean> booleanBox = new Box<>(true);
        System.out.println(booleanBox.getValue());

        System.out.println("@@@@@@@@@@@@@@@ - implement Dog - @@@@@@@@@@@@");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        System.out.println("@@@@@@@@@@@@@@@ - implement Cat - @@@@@@@@@@@@");
        Cat cat = new Cat();
        cat.eat();
        cat.scratches();
        String name = "Cat";
        cat.makeSound(name);

        //Bird class
        System.out.println("@@@@@@@@@@@@@@@ - implement Bird - @@@@@@@@@@@@");
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.getColor();

        Nest nest = new Bird();
        nest.addBird();
        System.out.println(nest.hasBird());
        nest.removeBird();
        System.out.println(nest.hasBird());
        bird.run();
        bird.stop();

        System.out.println("@@@@@@@@@@@@@@@ - implement Goat - @@@@@@@@@@@@");
        Goat goat = new Goat();
        goat.run();
        String goatName = "Goat";
        goat.makeSound(goatName);
    }
}