package com.example.entities;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount, boolean branch) {
        this.balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch) {
        if (amount > 500.00 && !branch) {
            throw new IllegalArgumentException();
        }

        this.balance -= amount;
        return this.balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }
}
