package com.arberlisaj;

public class MortgageCalculator {
  // Constants
  private static final byte MONTHS_IN_YEAR = 12;
  private static final byte PERCENT = 100;

  private final int principal;
  private final float annualInterest;
  private final byte years;

  public MortgageCalculator(int principal, float annualInterest, byte years) {
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  public double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    return principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments)
            - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
  }

  public double calculateMortgage() {
    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    return principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
  }

  public double[] getRemainingBalances() {
    var balances = new double[getNumberOfPayments()];
    for (short month = 1; month <= balances.length; month++)
      balances[month - 1] = calculateBalance(month);
    return balances;
  }

  private float getMonthlyInterest() {
    return annualInterest / PERCENT / MONTHS_IN_YEAR;
  }

  private int getNumberOfPayments() {
    return years * MONTHS_IN_YEAR;
  }
}
