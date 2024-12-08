package com.arberlisaj.exceptions;

public class ExceptionsDemo {
  public static void main(String[] args) {
    var account = new Account();
    try {
      account.withdraw(10);
    } catch (AccountException e) {
      var cause = e.getCause();
      System.out.println(cause.getMessage());
    }
  }
}
