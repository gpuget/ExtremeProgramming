package model;

import java.time.LocalDate;

public class Seance {
    private long id;
    private Cinema cinema;
    private Film film;
    private LocalDate date;

    public Seance() {
    }

    public Seance(long id, Cinema cinema, Film film, LocalDate date) {
        this.id = id;
        this.cinema = cinema;
        this.film = film;
        this.date = date;
    }

    public Seance(Cinema cinema, Film film, LocalDate date) {
        this.cinema = cinema;
        this.film = film;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }


    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                ", cinema=" + cinema +
                ", film=" + film +
                ", date=" + date +
                '}';
    }
}
