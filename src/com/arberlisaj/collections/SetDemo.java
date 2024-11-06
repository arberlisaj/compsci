package com.arberlisaj.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void show() {
    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

    set1.addAll(set2);

    set1.retainAll(set2);

    set1.removeAll(set2);
  }
}
