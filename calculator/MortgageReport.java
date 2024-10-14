package com.calculator;

import java.text.NumberFormat;

public class MortgageReport {
  private final NumberFormat currency;
  private final MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    for (double balance : calculator.getRemainingBalances())
      System.out.println(currency.format(balance));
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currency.format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}
