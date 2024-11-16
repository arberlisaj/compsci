package com.dataStructures.queues;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
  public static void reverse(Queue<Integer> queue, int k) {
    if (k < 0 || k > queue.size()) throw new IllegalArgumentException();

    java.util.Stack<Integer> stack = new Stack<>();

    // Dequeue the first K elements from the queue and push them onto the stack
    for (int i = 0; i < k; i++) stack.push(queue.remove());

    // Enqueue the content of the stack at the back of the queue
    while (!stack.empty()) queue.add(stack.pop());

    // Add the remaining items in the queue (items after the first K elements)
    // to the back of the queue and remove them from the beginning of the queue
    for (int i = 0; i < queue.size() - k; i++) queue.add(queue.remove());
  }
}
