package fr.oxyl.formation.xp.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ReservationController.class)
class ReservationControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void get() throws Exception {
    MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get("/reservations"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn();

    assertThat(result.getResponse().getContentAsString()).isEqualTo("coucou monde");
  }

}