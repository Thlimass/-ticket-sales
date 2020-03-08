package com.calindra.theater;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Movie movie_exterminador = new Movie(1,"Exterminador do Futuro","Ficcao",16);
        Room room = new Room(2,40);
        Session session = new Session(3,"04/03/2020","18:00",25,room,movie_exterminador);



//        Ticket ticket = new Ticket();
//        ticket.saleTicket(session,2);
//        System.out.println("valor do ticket " + ticket.getValor());;
//        System.out.println(session.toString());

    }
}
