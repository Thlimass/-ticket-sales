package com.calindra.theater;

public class Ingresso {

    public void vendeIngresso(Session session, int qtdeIngressos){
        var qtdeAcentosDisponiveis = session.getSala().getQtdAcentos();
        session.getSala().setQtdAcentos(qtdeAcentosDisponiveis - qtdeIngressos);

    }
}
