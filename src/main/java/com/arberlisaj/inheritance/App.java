package com.arberlisaj.inheritance;

public class App {
  public static void main(String[] args) {
    UIControl[] controls = {new Textbox(), new Checkbox()};
    for (var control : controls) {
      control.render();
    }
  }
}