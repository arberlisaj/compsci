package com.dataStructures.stacks;

public class MinStack {
  private Stack stack = new Stack();
  private Stack minStack = new Stack();

  public void push(int item) {
    stack.push(item);

    if (minStack.isEmpty()) minStack.push(item);
    else if (item < minStack.peek()) minStack.push(item);
  }

  public int pop() {
    if (stack.isEmpty()) throw new IllegalStateException();

    var top = stack.pop();

    if (minStack.peek() == top) minStack.pop();

    return top;
  }

  public int min() {
    return minStack.peek();
  }
}
