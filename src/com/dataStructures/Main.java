package com.dataStructures;

import com.dataStructures.arrays.Array;
import com.dataStructures.linkedLists.LinkedList;
import com.dataStructures.stacks.Stack;

public class Main {
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
    }

    ;
}
