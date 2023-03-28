package org.example;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Account biometrics
        account.setFirstName("Elon");
        System.out.println(account.getFirstName());
        account.setLastName("Musk");
        System.out.println(account.getLastName());
        account.setDateOfBirth(LocalDate.parse("1971-06-28"));
        System.out.println(account.getDateOfBirth());
        account.setAccountNumber("287452");
        System.out.println(account.getAccountNumber());
        account.setBalance(0);
        System.out.println(account.getBalance());

        // Deposit some money
        account.deposit(1000000.0);

        // Withdraw some money
        account.withdrawal(500.0);

        // Interest rate
        account.payInterest(1.5);

        // Prints out the current balance
        System.out.println("Your current balance is: " + account.getBalance());
    }

}