package com.udacity.gmscholarship.api;

import com.udacity.gmscholarship.model.Customer;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.model.Reservation;
import com.udacity.gmscholarship.service.CustomerService;
import com.udacity.gmscholarship.service.ReservationService;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class HotelResource {
    private CustomerService customerService = CustomerService.getInstance();

    private ReservationService reservationService = ReservationService.getInstance();
    private static HotelResource single_instance = null;

    private HotelResource(){}

    public static HotelResource getInstance(){
        if (single_instance == null) {
            single_instance = new HotelResource();
        }
        return getInstance();
    }

    public Customer getCustomer(String email){

        return customerService.getCustomer(email);
    }

    public void createACustomer(String email, String firstName, String lastName){
        customerService.addCustomer(email, firstName, lastName);
    }

    public IRoom getRoom(String roomNumber){
        return ReservationService.getInstance().getARoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return reservationService.reserveARoom(getCustomer(customerEmail), room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomersReservations(String customerEmail){
        final Customer customer = getCustomer(customerEmail);

        if (customer == null) {
            return Collections.emptyList();
        }
        return reservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){
        return reservationService.findRooms(checkIn, checkOut);
    }

}
