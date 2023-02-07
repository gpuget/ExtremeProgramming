package fr.oxyl.formation.xp.controllers;

import fr.oxyl.formation.xp.models.Reservation;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

  private static Reservation createReservation() {
    Reservation reservation = new Reservation();
    reservation.setUuid(UUID.randomUUID().toString());
    reservation.setUsername("username-" + UUID.randomUUID().toString());
    reservation.setCinema("cinema-" + UUID.randomUUID().toString());
    reservation.setDateTime(LocalDateTime.now());
    return reservation;
  }

  @GetMapping
  public ResponseEntity<List<Reservation>> get() {
    List<Reservation> reservations = Arrays.asList(
        createReservation(),
        createReservation()
    );
    return ResponseEntity.ok(reservations);
  }

}
