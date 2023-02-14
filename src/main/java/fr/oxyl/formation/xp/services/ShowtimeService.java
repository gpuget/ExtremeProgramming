package fr.oxyl.formation.xp.services;

import fr.oxyl.formation.xp.dto.CinemaDto;
import fr.oxyl.formation.xp.dto.MockData;
import fr.oxyl.formation.xp.dto.MovieDto;
import fr.oxyl.formation.xp.dto.ShowtimeDto;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ShowtimeService {

  public List<ShowtimeDto> getAllShowtimes() {

    return Arrays.asList(MockData.SHOWTIME_1, MockData.SHOWTIME_2);
  }
}
