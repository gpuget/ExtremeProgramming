package fr.oxyl.formation.xp.dto;

public class ReservationDto {
  private String id;
  private ShowtimeDto showtime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShowtimeDto getShowtime() {
    return showtime;
  }

  public void setShowtime(ShowtimeDto showtime) {
    this.showtime = showtime;
  }
}
