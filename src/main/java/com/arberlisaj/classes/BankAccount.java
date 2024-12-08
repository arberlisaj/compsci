package com.arberlisaj.classes;

public class BankAccount {
  // Static field shared by all accounts
  private static double interestRate = 0.02;
  // Fields (private for encapsulation)
  private final String accountNumber;
  private String accountHolderName;
  private double balance;

  // Constructor to initialize fields
  public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
  }

  // Static method to change the interest rate
  public static void setInterestRate(double newRate) {
    interestRate = newRate;
  }

  // Getter and Setter for account holder name
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  // Deposit method
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Invalid amount.");
    }
  }

  // Withdraw method
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: $" + amount);
    } else {
      System.out.println("Invalid amount.");
    }
  }

  // Method to calculate interest based on current balance
  public double calculateInterest() {
    return balance * interestRate;
  }

  // Method to display account details
  public void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Balance: $" + balance);
  }
}
