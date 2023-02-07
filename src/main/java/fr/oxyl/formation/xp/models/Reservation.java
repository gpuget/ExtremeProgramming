package fr.oxyl.formation.xp.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "reservation")
public class Reservation {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
  private String uuid;
  @Column
  private String username;
  @Column
  private String cinema;
  @Column(name = "date_time")
  private LocalDateTime dateTime;

  public String getUsername() {
    return username;
  }

  public void setUsername(String user) {
    this.username = user;
  }

  public String getCinema() {
    return cinema;
  }

  public void setCinema(String cinema) {
    this.cinema = cinema;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String id) {
    this.uuid = id;
  }
}
