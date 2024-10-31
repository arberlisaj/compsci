package com.arberlisaj;

import java.text.NumberFormat;

public class MortgageReport {
  private final NumberFormat currency;
  private final MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
    for (double balance : calculator.getRemainingBalances())
      System.out.println(currency.format(balance));
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currency.format(mortgage);
    System.out.println("Monthly Payment: " + mortgageFormatted);
  }
}
