package com.calindra.theater;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Movie movie_exterminador = new Movie(1,"Exterminador do Futuro","Ficcao",16);
        Room room = new Room(2,40);
        Session session = new Session(3,"04/03/2020","18:00",25,room,movie_exterminador);

        Ticket ticket = new Ticket();
        ticket = ticket.saleTicket(session,41);

        /*Se o nome ou qualquer campo do filme vier vazio imprime que nao foi possivel vender, se nao imprime o ingresso vendido*/
        if (ticket.getMovie() == null ) {
            System.out.println("Sessao lotada!");
        } else {
            System.out.println(ticket.toString());
        }

    }
}