package com.calindra.theater;

public class Room {
    private long id;
    private int qtdArmchair;

    public Room(long id, int qtdArmchair) {
        this.id = id;
        this.qtdArmchair = qtdArmchair ;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", qtdArmchair=" + qtdArmchair +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQtdArmchair() {
        return qtdArmchair;
    }

    public void setQtdArmchair(int qtdArmchair) {
        this.qtdArmchair = qtdArmchair;
    }
}
