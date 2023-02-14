package fr.oxyl.formation.xp.services;

import fr.oxyl.formation.xp.dto.MockData;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeService {

  private final ShowtimeRepository repository;

  public ShowtimeService(ShowtimeRepository repository) {
    this.repository = repository;
  }

  public List<ShowtimeDto> getAllShowtimes() {
    return Arrays.asList(MockData.SHOWTIME_1, MockData.SHOWTIME_2);
  }
}
