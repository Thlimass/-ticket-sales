package com.calindra.theater;



public class Session {
    private long id;
    private String date;
    private String hour;
    private double valor;
    private Room room;
    private Movie movie;

    public Session(long id, String date, String hour, double valor, Room room, Movie movie) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.valor = valor;
        this.room = room;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", valor=" + valor +
                ", room=" + room +
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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
