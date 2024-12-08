package com.dataStructures;

import com.dataStructures.arrays.Array;
import com.dataStructures.binaryTrees.Tree;
import com.dataStructures.heaps.MaxHeap;
import com.dataStructures.linkedLists.LinkedList;
import com.dataStructures.stacks.Stack;

public class App {
  public static void main(String[] args) {
    var numbers = new Array(3);
    numbers.insert(1);
    numbers.insert(2);
    numbers.insert(3);
    numbers.print();

    var list = new LinkedList();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);

    System.out.println("--------------");

    System.out.println(list.getKthFromTheEnd(0));

    System.out.println("--------------");

    var stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();

    int a = stack.peek();
    System.out.println(a);

    System.out.println("--------------");
    var firstTree = new Tree();
    var secondTree = new Tree();

    firstTree.insert(10);
    secondTree.insert(10);

    System.out.println(!secondTree.contains(11));
    System.out.println(firstTree.equals(secondTree));

    System.out.println("--------------");

    int[] grades = {1, 2, 5, 1, 2, 3};
    System.out.println(MaxHeap.getKthLargest(grades, 2));
  }
}
