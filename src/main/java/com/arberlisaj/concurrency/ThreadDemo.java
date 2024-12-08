package com.arberlisaj.concurrency;

public class ThreadDemo {
  public static void main(String[] args) {
    // Create a thread using a lambda expression
    var thread1 = new Thread(() -> System.out.println("a"));

    // Create a thread using an instance of a class that implements the runnable interfaceString[]
    // args
    var status = new DownloadStatus();
    var thread2 = new Thread(new DownloadFileTask(status));

    // Start the thread
    thread1.start();

    // Wait for the completion of a thread
    try {
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Put a thread to sleep
    try {
      thread1.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Get the current thread
    var current = Thread.currentThread();
    System.out.println(current.getId());
    System.out.println(current.getName());
  }
}
