package fr.oxyl.formation.xp.services;

import static org.assertj.core.api.Assertions.assertThat;

import fr.oxyl.formation.xp.dto.ShowtimeDto;
import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ShowtimeServiceTest {

  @Mock
  private ShowtimeRepository repository;
  @InjectMocks
  private ShowtimeService service;

  @Test
  void getAllShowtimes() {
    List<ShowtimeDto> showtimes = this.service.getAllShowtimes();

    assertThat(showtimes).hasSize(2);
  }
}