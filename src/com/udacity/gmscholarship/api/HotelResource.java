package com.udacity.gmscholarship.api;

import com.udacity.gmscholarship.model.Customer;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class HotelResource {
    private static HotelResource single_instance = null;

    private HotelResource(){}

    public static HotelResource getInstance(){
        if (single_instance == null) {
            single_instance = new HotelResource();
        }
        return getInstance();
    }

    public Customer getCustomer(String email){

        return getCustomer(email);
    }

    public void createACustomer(String email, String firstName, String lastName){

    }

    public IRoom getRoom(String roomNumber){
        return single_instance.getRoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date CheckOutDate){
        return new Reservation();
    }

    public Collection<Reservation> getCustomersReservations(String customerEmail){
        return new HashSet<>();
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){
        return new HashSet<>();
    }

}
