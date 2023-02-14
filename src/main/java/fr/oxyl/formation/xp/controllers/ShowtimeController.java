package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.dto.CinemaDto;
import fr.oxyl.formation.xp.dto.MovieDto;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import fr.oxyl.formation.xp.services.ShowtimeService;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/showtimes")
public class ShowtimeController {

  private final ShowtimeService service;

  public ShowtimeController(ShowtimeService service) {
    this.service = service;
  }

  @GetMapping
  public List<ShowtimeDto> getShowtimes() {
    return this.service.getAllShowtimes()
        .stream()
        .map(showtime -> {
          CinemaDto cinema = new CinemaDto();
          cinema.setName(showtime.getCinema().getName());
          MovieDto movie = new MovieDto();
          movie.setTitle(showtime.getMovie().getTitle());
          ShowtimeDto result = new ShowtimeDto();
          result.setCinema(cinema);
          result.setMovie(movie);
          result.setStart_time(showtime.getStartTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
          result.setEnd_time(showtime.getEndTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
          return result;
        })
        .collect(Collectors.toList());
  }
}

