package com.arberlisaj.inheritance;

public abstract class UIControl {
  private boolean isEnabled = true;

  public abstract void render();

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
