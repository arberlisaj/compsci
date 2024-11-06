package com.arberlisaj.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b");

    var front = queue.remove();

    front = queue.element();

    System.out.println(front);
    System.out.println(queue);

    // We have alternative methods that don't
    // throw an exception:

    // offer() similar to add()
    // poll() similar to remove()
    // peek() similar to element()
  }
}
