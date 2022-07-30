package com.udacity.gmscholarship.model;

import java.util.Date;


public class Reservation {

    private Customer customer;

    private IRoom room;

    private Date checkInDate;
    private Date checkOutDate;

    public Reservation() {

    }

    public Reservation(final Customer customer, final IRoom room, final Date checkInDate, final Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }





    public IRoom getRoom() {
        return room;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }



    @Override
    public String toString() {
        return "Customer: "+ customer +"\n"+
                "Room: "+ room +"\n"+
                "Check In Date: " + checkInDate +"\n"+
                "Check Out Date: "+ checkOutDate;
    }


}
