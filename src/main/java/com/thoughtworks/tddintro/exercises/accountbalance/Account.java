package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
        }
    }
}
