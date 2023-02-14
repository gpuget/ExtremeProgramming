package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.dto.CinemaDto;
import fr.oxyl.formation.xp.dto.MovieDto;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import fr.oxyl.formation.xp.services.ShowtimeService;
import java.util.Arrays;
import java.util.List;
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
    return this.service.getAllShowtimes();
  }
}

