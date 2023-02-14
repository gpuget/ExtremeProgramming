package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.dto.ShowtimeDto;
import java.util.Collections;
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
    return Collections.emptyList();
  }
}

