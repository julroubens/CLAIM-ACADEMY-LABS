package com.julrougens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jul Rougens", 10000);
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalanceCents() + " cents");

        account.deposit(5000);
        System.out.println("After depositing 5000 cents, balance: " +
                account.getBalanceCents() + " cents");

        account.withdraw(3000);
        System.out.println("After withdrawing 3000 cents, balance: " +
                account.getBalanceCents() + " cents");

        account.setOwner("Jane Doe");
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalanceCents() + " cents");

        account.setBalanceCents(15000);
        System.out.println("After setting balance to 15000 cents, balance: " +
                account.getBalanceCents() + " cents");

        account.deposit(-2000); // Attempt to deposit a negative amount
        System.out.println("After attempting to deposit -2000 cents, balance: " +
                account.getBalanceCents() + " cents");

        account.withdraw(20000); // Attempt to withdraw more than the current balance
        System.out
                .println("After attempting to withdraw 20000 cents, balance: " +
                        account.getBalanceCents() + " cents");

        printAccountDetails(account);

    }

    public static void printAccountDetails(BankAccount account) {
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalanceCents() + " cents");
    }

}