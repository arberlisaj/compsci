package com.dataStructures;

import com.dataStructures.arrays.Array;

public class Main {
  public static void main(String[] args) {
    var numbers = new Array(3);
    numbers.insert(1);
    numbers.insert(2);
    numbers.insert(3);

    numbers.print();
  };
}
