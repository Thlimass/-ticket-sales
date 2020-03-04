package com.calindra.theater;

public class Ticket {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void saleTicket(Session session, int qtdeTicket){
        var qtdeArmchairDisponiveis = session.getSala().getQtdArmchair();
        session.getSala().setQtdArmchair(qtdeArmchairDisponiveis - qtdeTicket);
        this.valor = session.getValor() * qtdeTicket;
    }
}
