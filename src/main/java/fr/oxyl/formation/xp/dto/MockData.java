package fr.oxyl.formation.xp.dto;

public class MockData {

  public static final CinemaDto CINEMA_1 = new CinemaDto();
  public static final CinemaDto CINEMA_2 = new CinemaDto();
  public static final MovieDto MOVIE_1 = new MovieDto();
  public static final ShowtimeDto SHOWTIME_1 = new ShowtimeDto();
  public static final ShowtimeDto SHOWTIME_2 = new ShowtimeDto();

  static {
    CINEMA_1.setName("Pathé Alésia");
    CINEMA_2.setName("Pathé Gaumont");

    MOVIE_1.setTitle("Avatar 2");

    SHOWTIME_1.setCinema(CINEMA_1);
    SHOWTIME_1.setMovie(MOVIE_1);
    SHOWTIME_1.setStart_time("2023-01-01 15:00");
    SHOWTIME_1.setEnd_time("2023-01-01 18:00");

    SHOWTIME_2.setCinema(CINEMA_2);
    SHOWTIME_2.setMovie(MOVIE_1);
    SHOWTIME_2.setStart_time("2023-01-01 15:00");
    SHOWTIME_2.setEnd_time("2023-01-01 18:00");
  }
}
