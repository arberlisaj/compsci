package com.dataStructures.hashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
  public char findFirstNonRepeatingChar(String str) {
    Map<Character, Integer> map = new HashMap<>();

    var chars = str.toCharArray();
    for (var ch : chars) {
      var count = map.containsKey(ch) ? map.get(ch) : 0;
      map.put(ch, count + 1);
    }

    for (var ch : chars) if (map.get(ch) == 1) return ch;

    return Character.MIN_VALUE;
  }

  public char findFirstRepeatedChar(String str) {
    Set<Character> set = new HashSet<>();

    for (var ch : str.toCharArray()) {
      if (set.contains(ch)) return ch;

      set.add(ch);
    }

    return Character.MIN_VALUE;
  }
}
