package com.arberlisaj.inheritance;

public class Textbox extends UIControl {
  private String text = "";

  @Override
  public void render() {
    System.out.println("Render Textbox");
  }

  @Override
  public String toString() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
