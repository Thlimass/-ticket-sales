package com.calindra.theater;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Session {
    private long id;
    private String date;
    private String horario;
    private double valor;
    private Room sala;
    private Movie movie;

    public Session(long id, String date, String horario, double valor, Room sala, Movie movie) {
        this.id = id;
        this.date = date;
        this.horario = horario;
        this.valor = valor;
        this.sala = sala;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", horario='" + horario + '\'' +
                ", valor=" + valor +
                ", sala=" + sala +
                ", movie=" + movie +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Room getSala() {
        return sala;
    }

    public void setSala(Room sala) {
        this.sala = sala;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
