package com.calindra.theater;

/**Classe -  Representa meu objeto (Nesse caso e um Ticket)**/
public class Ticket {
    private  long id;
    private String date;
    private String hour;
    private double qntTicketsale;
    private long room;
    private String movie;
    private String type;

    public Ticket(){

    }

    /**Construtor - Responsavel por construir/criar um objeto do tipo da minha classe.
     * Com todos os campos passados para ele (construtor) obrigatoriamente**/
    public Ticket (long id, String movie,  long room, double qntTicketsale, String date, String hour, String type){
        this.id = id;
        this.movie = movie;
        this.room = room;
        this.qntTicketsale = qntTicketsale;
        this.date = date;
        this.hour = hour;
        this.type = type;
    }



    /**Responsavel por possibilitar a impressao do meu objeto formatado**/
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", qntTicketsale=" + qntTicketsale +
                ", room=" + room +
                ", movie='" + movie + '\'' +
                ", type='" + type + '\'' +
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

    public double getQntTicketsale() {
        return qntTicketsale;
    }

    public void setQntTicketsale(double qntTicketsale) {
        this.qntTicketsale = qntTicketsale;
    }

    public long getRoom() {
        return room;
    }

    public void setRoom(long room) {
        this.room = room;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //TODO Diminuir a qtde de cadeiras disponieis na sala - OK
    //TODO Validar se existem cadeiras disponiveis para a quantidade de ingressos comprados Se(qtdeIngress > QtdeCadeiras) : Nao posso vender senao posso vender
    //TODO Calcular o valor do total de ingressos vendidos - OK
    //TODO Imprimir o ingresso vendido ao final da venda concluida
    public Ticket saleTicket(Session session, int qtdeTicket, String tipo){

        /*Pegando a quantidade de cadeiras disponiveis*/
        var qtdeArmchairDisponiveis = session.getRoom().getQtdArmchair();
//
        /*Colocando o novo valor de cadeiras dispoviveis na sala*/
        session.getRoom().setQtdArmchair(qtdeArmchairDisponiveis - qtdeTicket);

        /*Construir o filme*/
        Ticket ticket = new Ticket();

        double totalTicketVendido = 0;
        String tipoIgresso;
        if (qtdeArmchairDisponiveis > qtdeTicket){

            if(tipo.equals("MEIA")){
                tipoIgresso = "MEIA ENTRADA";
                totalTicketVendido = ((session.getValor()/2) * qtdeTicket);
            } else if(tipo.equals("INTEIRA")) {
                tipoIgresso = "INTEIRA";
                totalTicketVendido = session.getValor() * qtdeTicket;
            }else{
                tipoIgresso = "INTEIRA";
                totalTicketVendido = session.getValor() * qtdeTicket;
            }

            ticket.setMovie(session.getMovie().getTitle());
            ticket.setDate(session.getDate());
            ticket.setHour(session.getHour());
            ticket.setRoom(session.getRoom().getId());
            ticket.setQntTicketsale(totalTicketVendido);
            ticket.setType(tipoIgresso);
        }


        return ticket;
    }


}
