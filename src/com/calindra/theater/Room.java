package com.calindra.theater;

public class Room {
    private long id;
    private int qtdAcentos;

    public Room(long id, int qtdAcentos) {
        this.id = id;
        this.qtdAcentos = qtdAcentos;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", qtdAcentos=" + qtdAcentos +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(int qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }
}
