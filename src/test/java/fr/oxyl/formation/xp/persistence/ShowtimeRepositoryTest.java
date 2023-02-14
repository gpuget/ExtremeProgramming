package fr.oxyl.formation.xp.persistence;

import static org.assertj.core.api.Assertions.assertThat;

import fr.oxyl.formation.xp.models.Showtime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ShowtimeRepositoryTest {

  @Autowired
  private ShowtimeRepository repository;

  @Test
  void findAll() {

    List<Showtime> showtimes = this.repository.findAll();

    assertThat(showtimes).isNotNull().hasSize(6);
  }

}