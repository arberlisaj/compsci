package com.arberlisaj.interfaces.project;

public class App{

  public static void main(String[] args) {
    var video = new Video();
    video.setFileName("video.mp4");
    video.setTitle("Arber's birthday");
    video.setUser(new User("arber@gmail.com"));

    var processor =
        new VideoProcessor(new XVideoEncoder(), new SqlVideoDatabase(), new EmailService());
    processor.process(video);
  }
}
