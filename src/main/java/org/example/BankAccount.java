package org.example;

import java.time.LocalDate;

public class BankAccount {
    private String firstName;   // create private variables for each property
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;    // Note, I used "double" here to take decimal places into account

    // Constructors
    public BankAccount() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit money in the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money from the account
    public void withdrawal(double amount) {
        balance -= amount;
    }

    // To calculate interest
    public void payInterest(double rate) {
        balance += balance * (rate / 100);
    }
}


