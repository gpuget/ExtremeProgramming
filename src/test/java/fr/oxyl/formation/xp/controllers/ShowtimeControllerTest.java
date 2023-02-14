package fr.oxyl.formation.xp.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import fr.oxyl.formation.xp.persistence.ShowtimeRepository;
import fr.oxyl.formation.xp.services.ShowtimeService;
import java.util.Collections;
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
    when(this.showtimeService.getAllShowtimes())
        .thenCallRealMethod();

    this.mockMvc.perform(get("/showtimes"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(2)));
  }

}