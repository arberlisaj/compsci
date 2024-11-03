package com.arberlisaj.interfaces;

public class Main {
  public static void main(String[] args) {
    var calculator = new TaxCalculator2024(100_000);
    var report = new TaxReport();
    // method injection
    report.show(calculator);
    report.show(new TaxCalculator2025());
  }
}
