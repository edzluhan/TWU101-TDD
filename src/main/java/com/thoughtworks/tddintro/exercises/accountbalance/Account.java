package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private double balance = 0.0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
