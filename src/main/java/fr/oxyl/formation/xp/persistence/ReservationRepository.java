package fr.oxyl.formation.xp.persistence;

import fr.oxyl.formation.xp.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
