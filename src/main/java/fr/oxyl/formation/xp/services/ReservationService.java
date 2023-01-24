package fr.oxyl.formation.xp.services;

import fr.oxyl.formation.xp.models.Reservation;
import fr.oxyl.formation.xp.persistence.ReservationRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

  private final ReservationRepository repository;

  public ReservationService(ReservationRepository repository) {
    this.repository = repository;
  }

  public Reservation reserve() {
    Reservation reservation = new Reservation();
    reservation.setId(UUID.randomUUID().toString());
    return this.repository.save(reservation);
  }

}
