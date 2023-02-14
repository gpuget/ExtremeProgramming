package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.dto.ReservationDto;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

  @PostMapping
  public ReservationDto reserve(@RequestBody ShowtimeDto showtime) {
    ReservationDto reservation = new ReservationDto();
    reservation.setId(UUID.randomUUID().toString());
    reservation.setShowtime(showtime);
    return reservation;
  }

}
