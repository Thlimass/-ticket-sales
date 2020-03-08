package com.calindra.theater;

/**Classe -  Representa meu objeto (Nesse caso e um Ticket)**/
public class Ticket {
    private  long id;
    private String date;
    private String hour;
    private double valor;
    private int room;
    private String movie;

    /**Construtor - Responsavel por construir/criar um objeto do tipo da minha classe**/
    public Ticket (long id, String movie,  int room, double valor, String date, String hour){
        this.id = id;
        this.movie = movie;
        this.room = room;
        this.valor = valor;
        this.date = date;
        this.hour = hour;
    }

    /**Responsavel por possibilitar a impressao do meu objeto formatado**/
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", valor=" + valor +
                ", room=" + room +
                ", movie='" + movie + '\'' +
                '}';
    }

    /**GET - Responsavel por pegar o valor campo ou objeto**/
    public long getId() {
        return id;
    }

    /**SET - Responsavel por colocar valor no campo ou objeto**/
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }





    /*private double valor;

    public double getValor() {
        return valor;
    }

    public void saleTicket(Session session, int qtdeTicket){
        var qtdeArmchairDisponiveis = session.getSala().getQtdArmchair();
        session.getSala().setQtdArmchair(qtdeArmchairDisponiveis - qtdeTicket);
        this.valor = session.getValor() * qtdeTicket;
    }*/
}
