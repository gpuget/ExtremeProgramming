package fr.oxyl.formation.xp.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import fr.oxyl.formation.xp.models.Cinema;
import fr.oxyl.formation.xp.models.Movie;
import fr.oxyl.formation.xp.models.Showtime;
import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import java.time.LocalDateTime;
import java.util.Arrays;
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
    Cinema cinema = new Cinema();
    cinema.setId(1);
    cinema.setName("cinema1");
    Movie movie = new Movie();
    movie.setId(1);
    movie.setTitle("movie1");
    movie.setTitle("director1");
    Showtime showtime = new Showtime();
    showtime.setId(1);
    showtime.setMovie(movie);
    showtime.setCinema(cinema);
    showtime.setStartTime(LocalDateTime.MIN);
    showtime.setEndTime(LocalDateTime.MAX);
    List<Showtime> showtimes = Arrays.asList(showtime);
    when(this.repository.findAll()).thenReturn(showtimes);

    List<Showtime> result = this.service.getAllShowtimes();

    verify(this.repository, times(1)).findAll();
    assertThat(result).hasSize(1);
  }
}