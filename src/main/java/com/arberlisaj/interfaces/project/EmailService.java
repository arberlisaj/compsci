package com.arberlisaj.interfaces.project;

public class EmailService implements NotificationService {
  @Override
  public void notify(User user) {
    System.out.println("Notifying " + user.getEmail() + "...");
    System.out.println("Done!\n");
  }
}
