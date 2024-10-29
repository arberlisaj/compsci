package com.arberlisaj;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
  // Constants
  static final byte MONTHS_IN_YEAR = 12;
  static final byte PERCENT = 100;

  public static void main(String[] args) {
    // Read principal, annualInterest and years from the user
    int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
    float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte) readNumber("Period (Years): ", 1, 30);

    // Print the mortgage payment and payment schedule
    printMortgage(principal, annualInterest, years);
    printPaymentSchedule(principal, annualInterest, years);
  }

  // Calculates and prints the monthly mortgage payment
  private static void printMortgage(int principal, float annualInterest, byte years) {
    double mortgage = calculateMortgage(principal, annualInterest, years);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  // Prints the payment schedule for each month
  private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
    for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
      double balance = calculateBalance(principal, annualInterest, years, month);
      System.out.println(
          "Month " + month + ": " + NumberFormat.getCurrencyInstance().format(balance) + " left.");
    }
  }

  // Reads a number from user input within a specified range
  public static double readNumber(String prompt, double min, double max) {
    Scanner scanner = new Scanner(System.in); // Create scanner for input
    double value;
    while (true) {
      System.out.print(prompt); // Prompt user for input

      // Check if the next input is a double
      if (scanner.hasNextDouble()) {
        value = scanner.nextDouble();

        // Check if the value is within the range
        if (value >= min && value <= max) {
          break;
        } else {
          System.out.println("Enter a value between " + min + " and " + max + ": ");
        }
      } else {
        System.out.println("Invalid input."); // Inform user of invalid input
        scanner.next(); // Clear invalid input
      }
    }
    return value;
  }

  // Calculates remaining balance on the mortgage after a certain number of payments
  public static double calculateBalance(
      int principal, float annualInterest, byte years, short numberOfPaymentsMade) {
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; // Monthly interest rate
    float numberOfPayments = years * MONTHS_IN_YEAR; // Total number of payments

    // Calculate balance using formula
    double balance =
        principal
            * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  // Calculates the monthly mortgage payment using the principal, annual interest
  // rate, and term
  public static double calculateMortgage(int principal, float annualInterest, byte years) {

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; // Monthly interest rate
    float numberOfPayments = years * MONTHS_IN_YEAR; // Total number of payments

    // Mortgage calculation formula:
    // https://www.wikihow.com/Calculate-Mortgage-Payments
    double mortgage =
        principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }
}
