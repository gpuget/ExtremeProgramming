package fr.oxyl.formation.xp.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import fr.oxyl.formation.xp.models.Cinema;
import fr.oxyl.formation.xp.models.Movie;
import fr.oxyl.formation.xp.models.Showtime;
import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import fr.oxyl.formation.xp.services.ShowtimeService;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = ShowtimeController.class)
class ShowtimeControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ShowtimeRepository showtimeRepository;
  @MockBean
  private ShowtimeService showtimeService;

  @Test
  void getShowtimes_ShouldBeOk() throws Exception {
    Cinema cinema = new Cinema();
    cinema.setId(1);
    cinema.setName("cinema1");
    Movie movie = new Movie();
    movie.setId(1);
    movie.setTitle("movie1");
    movie.setDirector("director1");
    Showtime showtime = new Showtime();
    showtime.setId(1);
    showtime.setMovie(movie);
    showtime.setCinema(cinema);
    showtime.setStartTime(LocalDateTime.of(2023, 1, 1, 15, 0));
    showtime.setEndTime(LocalDateTime.of(2023, 1, 1, 18, 0));
    List<Showtime> showtimes = Arrays.asList(showtime);
    when(this.showtimeService.getAllShowtimes())
        .thenReturn(showtimes);

    this.mockMvc.perform(get("/showtimes"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].cinema.name", is("cinema1")))
        .andExpect(jsonPath("$[0].movie.title", is("movie1")))
        .andExpect(jsonPath("$[0].start_time", is("2023-01-01 15:00")))
        .andExpect(jsonPath("$[0].end_time", is("2023-01-01 18:00")));
  }

}