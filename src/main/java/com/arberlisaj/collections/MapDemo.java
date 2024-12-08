package com.arberlisaj.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void show() {
    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e2");

    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    var exists = map.containsKey("e1");

    var unknown = new Customer("Unknown", "");
    var customer = map.get("e1");
    customer = map.getOrDefault("e1", unknown);

    map.replace("e1", new Customer("a++", "e1"));

    for (var key : map.keySet()) System.out.println(key);

    for (var value : map.values()) System.out.println(value);

    for (var entry : map.entrySet()) System.out.println(entry);
  }
}
