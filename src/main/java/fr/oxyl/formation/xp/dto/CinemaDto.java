package fr.oxyl.formation.xp.dto;

import java.util.List;

public class CinemaDto {
  private String name;
  private String location;
  private List<MovieDto> movies;
  private List<ShowtimeDto> showtimes;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<MovieDto> getMovies() {
    return movies;
  }

  public void setMovies(List<MovieDto> movies) {
    this.movies = movies;
  }

  public List<ShowtimeDto> getShowtimes() {
    return showtimes;
  }

  public void setShowtimes(List<ShowtimeDto> showtimes) {
    this.showtimes = showtimes;
  }
}
