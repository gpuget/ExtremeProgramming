package fr.oxyl.formation.xp.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import fr.oxyl.formation.xp.models.Reservation;
import fr.oxyl.formation.xp.persistence.ReservationRepository;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ReservationServiceTest {

  @Mock
  private ReservationRepository repository;
  @InjectMocks
  private ReservationService service;

  @Test
  void reserve() {
    Reservation saved = new Reservation();
    when(this.repository.save(any())).thenReturn(saved);

    Reservation reservation = this.service.reserve();

    verify(this.repository).save(any());
    assertThat(reservation).isSameAs(saved);
  }
}