package com.arberlisaj.streams;

public class Movie implements Comparable<Movie> {
  private String title;
  private int likes;

  private Genre genre;

  public Movie(String title, int likes, Genre genre) {
    this.title = title;
    this.likes = likes;
    this.genre = genre;
  }

  public String getTitle() {
    return title;
  }

  public Genre getGenre() {
    return genre;
  }

  public int getLikes() {
    return likes;
  }

  @Override
  public int compareTo(Movie o) {
    return 0;
  }
}
