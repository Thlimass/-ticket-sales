package com.calindra.theater;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

	Movie movie = new Movie(1,"Exterminador do Futuro","Ficcao",16);
    Room room = new Room(2,40);
    Session session = new Session(3,"04/03/2020","18:00",35,room,movie);

    Ingresso ingresso = new Ingresso();
    ingresso.vendeIngresso(session,41);

    System.out.println(session.toString());

    }
}
