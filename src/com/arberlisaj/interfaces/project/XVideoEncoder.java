package com.arberlisaj.interfaces.project;

public class XVideoEncoder implements VideoEncoder {
  @Override
  public void encode(Video video) {
    System.out.println("Encoding video...");
    System.out.println("Done!\n");
  }
}
