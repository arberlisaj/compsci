package com.arberlisaj.classes;

public class App {
  public static void main(String[] args) {
    Employee employee = new Employee(50_000, 20);
    Employee.printNumberOfEmployees();
    int wage = employee.calculateWage();
    System.out.println(wage);
  }
}
