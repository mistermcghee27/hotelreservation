package com.udacity.gmscholarship.api;

import com.udacity.gmscholarship.model.Customer;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.service.CustomerService;
import com.udacity.gmscholarship.service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {
    private static AdminResource single_instance = null;
    private final CustomerService customerService = CustomerService.getInstance();

    private final ReservationService reservationService = ReservationService.getInstance();

    private AdminResource(){}

    public static AdminResource getInstance(){
        if (single_instance == null) {
            single_instance = new AdminResource();
        }
        return single_instance;
    }

    public Customer getCustomer(String email){
        return customerService.getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms){
        rooms.forEach(reservationService::addRoom);
        }


    public Collection<IRoom> getAllRooms(){
        return reservationService.getAllRooms();
    }

    public Collection<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    public void displayAllReservations(){
        reservationService.printAllReservation();
    }
}
