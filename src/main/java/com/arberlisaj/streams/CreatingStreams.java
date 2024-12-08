package com.arberlisaj.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
  public static void main(String[] args) {
    // From a collection
    List<Integer> list = new ArrayList<>();
    list.stream().forEach(n -> System.out.println(n));

    // From an array
    int[] array = {1, 2, 3};
    Arrays.stream(array).forEach(n -> System.out.println(n));

    // From an arbitrary number of objects
    Stream.of(1, 2, 3).forEach(n -> System.out.println(n));

    // Generate from scratch
    Stream.generate(() -> Math.random()).limit(3).forEach(n -> System.out.println(n));

    // Generate from scratch
    Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));
  }
}
