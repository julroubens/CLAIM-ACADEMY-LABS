package com.julrougens;

public class BankAccount {
    private String owner;
    private int balanceCents;

    public BankAccount(String owner, int balanceCents) {
        this.owner = owner;
        this.balanceCents = balanceCents;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalanceCents() {
        return balanceCents;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalanceCents(int balanceCents) {
        this.balanceCents = balanceCents;
    }

    public boolean withdraw(int amountCents) {
        if (amountCents < 0 || amountCents > balanceCents) {
            return false; // Cannot withdraw a negative amount or more than the current balance
        }
        balanceCents -= amountCents;
        return true; // Withdrawal successful
    }

    public boolean deposit(int amountCents) {
        if (amountCents < 0) {
            return false; // Cannot deposit a negative amount
        }
        balanceCents += amountCents;
        return true; // Deposit successful
    }

}
