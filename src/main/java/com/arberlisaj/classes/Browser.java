package com.arberlisaj.classes;

public class Browser {
  public void navigate(String address) {
    String ip = findIpAddress(address);
    String html = sendHttpRequest(ip);
    System.out.println(html);
  }

  private String findIpAddress(String ip) {
    return "<html></html>";
  }

  private String sendHttpRequest(String ip) {
    return "127.0.0.1";
  }
}