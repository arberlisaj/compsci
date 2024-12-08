package com.arberlisaj.exceptions;

public class Account {
  private float balance;

  public void deposit(float value) {
    if (value <= 0) throw new IllegalArgumentException();
  }

  public void withdraw(float value) throws AccountException {
    if (value > balance) throw new AccountException(new InsufficientFundsException());
  }
}
