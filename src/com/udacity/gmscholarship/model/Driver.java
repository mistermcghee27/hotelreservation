package com.udacity.gmscholarship.model;

import com.udacity.gmscholarship.service.CustomerService;
import com.udacity.gmscholarship.service.ReservationService;

import java.util.Date;

import static com.udacity.gmscholarship.model.RoomType.SINGLE;


public class Driver {
    public static void main(String[] args) {

        //testing the Customer Service class
        CustomerService customerService = CustomerService.getInstance();

        customerService.addCustomer("ogmark@gmail.com", "Marcus","McGhee");

        customerService.getCustomer("ogmark@gmail.com");

        System.out.println(customerService.getAllCustomers());

        //testing adding a room
        ReservationService reservationService = ReservationService.getInstance();

        //testing reservation
        Room room = new Room("101",150.00, SINGLE);

       reservationService.reserveARoom(customerService.getCustomer("ogmark@gmail.com"),room,new Date(),new Date());


        reservationService.printAllReservation();




    }

    }

