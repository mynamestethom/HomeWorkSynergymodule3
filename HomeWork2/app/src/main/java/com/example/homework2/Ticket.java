package com.example.homework2;

import java.io.Serializable;

public class Ticket implements Serializable {

    private long id;
    private String name;
    private String data;
    private static final int priceTicket = 670;

    public Ticket( String name, String data){
        this.name = name;
        this.data = data;
    }

    public String getName(){
        return name;
    }
    public static int getPriceTicket() {
        return priceTicket;
    }
    public String getData() {
        return data;
    }
}
