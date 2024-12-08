package com.designPatterns;

import com.designPatterns.memento.Editor;
import com.designPatterns.memento.History;

public class App{
  public static void main(String[] args) {
    var editor = new Editor();
    var history = new History();

    editor.setContent("a");
    history.push(editor.createState());

    editor.setContent("b");
    history.push(editor.createState());

    editor.setContent("c");
    // we get b
    editor.restore(history.pop());
    // we get a
    editor.restore(history.pop());

    System.out.println(editor.getContent());
  }
}
