package com.dataStructures.stacks;

import java.util.Stack;

public class Reverser {
  public String reverse(String input) {
    if (input == null) throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray()) stack.push(ch);

    StringBuffer reversed = new StringBuffer();
    while (!stack.empty()) reversed.append(stack.pop());

    return reversed.toString();
  }
}
