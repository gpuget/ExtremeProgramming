package fr.oxyl.formation.xp.services;

import fr.oxyl.formation.xp.models.Showtime;
import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeService {

  private final ShowtimeRepository repository;

  public ShowtimeService(ShowtimeRepository repository) {
    this.repository = repository;
  }

  public List<Showtime> getAllShowtimes() {
    return this.repository.findAll();
  }
}
