package com.arberlisaj.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("a");
    collection.add("b");
    collection.add("c");

    // Add multiple items in one go
    Collections.addAll(collection, "a", "b", "c");

    var size = collection.size();

    collection.remove("a");
    var containsA = collection.contains("a");

    collection.clear();
    var isEmpty = collection.isEmpty();

    Object[] objectArray = collection.toArray();
    String[] stringArray = collection.toArray(new String[0]);

    Collection<String> other = new ArrayList<>();
    other.add("a");
    other.add("b");
    other.add("c");
    System.out.println(collection == other);
    System.out.println(collection.equals(other));
  }
}
