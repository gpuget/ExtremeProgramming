package fr.oxyl.formation.xp.persistence;

import static org.assertj.core.api.Assertions.assertThat;

import fr.oxyl.formation.xp.models.Reservation;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ReservationRepositoryTest {

  @Autowired
  private ReservationRepository repository;

  @BeforeEach
  void setUp() {
    Reservation reservation = new Reservation();
    reservation.setId(UUID.randomUUID().toString());
    this.repository.save(reservation);
  }

  @AfterEach
  void tearDown() {
    this.repository.deleteAll();
  }

  @Test
  void findAll() {
    List<Reservation> reservations = this.repository.findAll();

    assertThat(reservations)
        .isNotEmpty()
        .hasSize(1);
  }

}