package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.dto.CinemaDto;
import fr.oxyl.formation.xp.dto.MovieDto;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/showtimes")
public class ShowtimeController {

  public ShowtimeController() {
  }

  @GetMapping
  public List<ShowtimeDto> getShowtimes() {
    CinemaDto cinema1 = new CinemaDto();
    cinema1.setName("Pathé Alésia");
    CinemaDto cinema2 = new CinemaDto();
    cinema2.setName("Pathé Gaumont");

    MovieDto movie1 = new MovieDto();
    movie1.setTitle("Avatar 2");

    ShowtimeDto showtime1 = new ShowtimeDto();
    showtime1.setCinema(cinema1);
    showtime1.setMovie(movie1);
    showtime1.setStart_time("2023-01-01 15:00");
    showtime1.setEnd_time("2023-01-01 18:00");
    ShowtimeDto showtime2 = new ShowtimeDto();
    showtime2.setCinema(cinema2);
    showtime2.setMovie(movie1);
    showtime2.setStart_time("2023-01-01 15:00");
    showtime2.setEnd_time("2023-01-01 18:00");

    return Arrays.asList(showtime1, showtime2);
  }
}

