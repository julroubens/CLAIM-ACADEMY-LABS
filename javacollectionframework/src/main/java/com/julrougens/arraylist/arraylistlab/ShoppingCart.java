package com.julrougens.arraylist.arraylistlab;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCart {
    public static void main(String[] args) {
//        Task 1
        System.out.println("Part 1 continued: Inspect the empty list");
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("Shopping list: " + shoppingList);
        System.out.println("Number of items: " + shoppingList.size());
        System.out.println("Is the list empty? " + shoppingList.isEmpty());
/*
        1. What does <String> tell Java?
            <String> Define the type off the arrayList
        2. What does new ArrayList<>() create?
            It means that new instance of the ArrayList<>() class
        3. Why does size() return 0?
            Cause the arraylist is empty.

 */

//        Task 2
        System.out.println("\nPart 2: Add groceries");
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Rice");
        shoppingList.add("Apples");
        System.out.println("Shopping list:: " + shoppingList);
        System.out.println("Number of items: "  + shoppingList.size());
        /*
        What would happen if you called shoppingList.get(5) now?
        An exception cause we just have 5 products that means we only have index 4
         */

//        Task 3
        System.out.println("\nPart 3: Insert and retrieve items");
        shoppingList.add(2, "Banana");
        System.out.println("Shopping list: " + shoppingList);
        System.out.println("First item: " + shoppingList.get(0));
        System.out.println("Item at index 2: " + shoppingList.get(2));
        System.out.println("Last item: " + shoppingList.get(shoppingList.size() - 1));

        /*
        1. What happened to the index of "Eggs"?
            It's been replaced by Banana
        2. Did the insertion replace an existing item?
            No
        3. Why is size() - 1 more flexible than a hardcoded final index?
            Because you don't know the size of the arraylist sometime
         */

//        Task 4
        System.out.println("\nPart 4: Replace items");
            int milkIndex = shoppingList.indexOf("Milk");
            if (milkIndex != -1) {
                shoppingList.set(milkIndex, "Oat milk");
            }
            System.out.println("Shopping list: " + shoppingList);
            System.out.println("Number of items: " + shoppingList.size());
        /*
        1. Why should you check for -1?
            check if Milk exist in the arrayList
        2. Why does the size remain six?
            Because we just replace Milk by Oat milk
        3. How would add(milkIndex, "Oat milk") behave differently?
            shoppingList.set(milkIndex, "Oat milk");
         */

//        Task 5
        System.out.println("\nPart 5: Remove items");
        shoppingList.remove("Eggs");
        System.out.println("Shopping list: " + shoppingList);
        shoppingList.remove(0);
        System.out.println("Shopping list: " + shoppingList);
        shoppingList.remove("Coffee");
        /*
        1. Which item did the index-based removal delete?
            Breed
        2. Why did removing "Coffee" return false?
            Coffee does not exist
        3. Did that unsuccessful removal change the list?
         */

//        Task 6
        System.out.println("\nPart 6: Search and prevent duplicates");
       boolean result = shoppingList.contains("Rice");
       System.out.println("Contains Rice? " + result);
       boolean result2 = shoppingList.contains("rice");
       System.out.println("Contains rice? " + result2);

        if (!shoppingList.contains("Coffee")) {
            shoppingList.add("Coffee");
        }

        if (!shoppingList.contains("Rice")) {
            shoppingList.add("Rice");
        }
        System.out.println("Shopping list: " + shoppingList);
        /*
        1. Why do the two searches produce different results?
            Because it case sensitive
        2. Does ArrayList automatically prevent duplicates?
            No
        3. What does the ! operator mean in the condition?
            Difference
         */

//        Task 7
        System.out.println("\nPart 7: Display a numbered list");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(i + ". " + shoppingList.get(i) + " \n ");
        }
        System.out.println("Total items: " + shoppingList.size());

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print("Remember to buy " + shoppingList.get(i) + " \n ");
        }

        /*
        Which loop is more convenient when you need the element's index?
        for (int i,....)
         */

//        Task 8
        System.out.println("\nPart 8: Remove several matching items safely");
        String[] items = {"Oat milk", "Bananas", "Rice", "Apples", "Coffee", "Chocolate", "Crackers"};
        ArrayList<String> shoppingListUpdated = new ArrayList<>();

        Collections.addAll(shoppingListUpdated, items);

        for (String item : shoppingListUpdated){
            if (!shoppingList.contains(item)) {
                shoppingList.add(item);
            }
        }
        System.out.println("Shopping list updated: " + shoppingList);

        for (int i = shoppingList.size() - 1; i >= 0; i--) {
            if (shoppingList.get(i).startsWith("C")) {
                shoppingList.remove(i);
            }
        }
        System.out.println("Shopping list updated: " + shoppingList);

//        Task 9
        System.out.println("\nPart 9: Clear the list");
        shoppingList.clear();
        System.out.println("Shopping list: " + shoppingList);
//       Task 10
        System.out.println("\nPart 10: Integer removal investigation");
        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(1);
        quantities.add(2);
        quantities.add(3);
        quantities.add(2);
        quantities.remove(2);

        System.out.println(quantities);

        quantities.remove(Integer.valueOf(2));
        System.out.println(quantities);




    }
}
