package fr.oxyl.formation.xp.dto;

public class ShowtimeDto {
  private CinemaDto cinema;
  private MovieDto movie;
  private String start_time;
  private String end_time;

  public CinemaDto getCinema() {
    return cinema;
  }

  public void setCinema(CinemaDto cinema) {
    this.cinema = cinema;
  }

  public MovieDto getMovie() {
    return movie;
  }

  public void setMovie(MovieDto movie) {
    this.movie = movie;
  }

  public String getStart_time() {
    return start_time;
  }

  public void setStart_time(String start_time) {
    this.start_time = start_time;
  }

  public String getEnd_time() {
    return end_time;
  }

  public void setEnd_time(String end_time) {
    this.end_time = end_time;
  }
}
