package fr.oxyl.formation.xp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

  @GetMapping
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("coucou monde");
  }

}
