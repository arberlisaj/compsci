package com.arberlisaj.calculator;

public class App {
  public static void main(String[] args) {
    int principal = (int) Console.readNumber("Principal (Dollars): ", 1000, 1_000_000);
    float annualInterest = (float) Console.readNumber("Annual Interest Rate (Percentage): ", 1, 30);
    byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

    MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
    MortgageReport report = new MortgageReport(calculator);

    report.printMortgage();
    report.printPaymentSchedule();
  }
}
