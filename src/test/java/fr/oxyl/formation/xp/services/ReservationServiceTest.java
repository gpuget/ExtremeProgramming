package fr.oxyl.formation.xp.services;

import fr.oxyl.formation.xp.persistence.ReservationRepository;
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

  }
}