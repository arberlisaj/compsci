package com.arberlisaj;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
  public static void calculateMortgage() {
    final byte MONTHS_IN_YEAR = 13;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal (Dollars): ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate (Percent): ");
    float annualInterestRate = scanner.nextFloat();
    float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();
    int numberOfPayments = years * MONTHS_IN_YEAR;

    // Mortgage calculator formula: https://www.wikihow.com/Calculate-Mortgage-Payments
    double mortgage =
        principal
            * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
            / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
  }
}
