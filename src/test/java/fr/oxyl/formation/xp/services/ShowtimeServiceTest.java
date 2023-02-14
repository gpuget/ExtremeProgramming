package fr.oxyl.formation.xp.services;

import static org.assertj.core.api.Assertions.assertThat;

import fr.oxyl.formation.xp.dto.ShowtimeDto;
import java.util.List;
import org.junit.jupiter.api.Test;

class ShowtimeServiceTest {

  private final ShowtimeService service = new ShowtimeService();

  @Test
  void getAllShowtimes() {
    List<ShowtimeDto> showtimes = this.service.getAllShowtimes();

    assertThat(showtimes).hasSize(2);
  }
}