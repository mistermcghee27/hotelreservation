package com.udacity.gmscholarship.service;


import com.udacity.gmscholarship.model.Customer;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.model.Reservation;
import com.udacity.gmscholarship.model.Room;

import java.util.*;
import java.util.concurrent.Callable;

public class  ReservationService {

    //using hashMap to add and keep track of rooms.
    HashMap<String, IRoom> roomHashMap = new HashMap<>();

    HashMap<String, Collection<Reservation>> reservations = new HashMap<>();


    //Static variable reference of Single_instance
    private static ReservationService single_instance = null;


    //Private constructor restricting class to itself
    private ReservationService() {
    }

    //Static method to create an instance of ReservationService
    public static ReservationService getInstance() {
        if (single_instance == null) {
            single_instance = new ReservationService();
        }
        return single_instance;
    }

    public void addRoom(IRoom room) {
        roomHashMap.put(room.getRoomNumber(), room);
    }

    public IRoom getARoom(String roomNumber) {
        return roomHashMap.get(roomNumber);
    }


    //create a reservation
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        Collection<Reservation> customerReservations = getCustomersReservation(customer);
        if (customerReservations == null) {
            customerReservations = new ArrayList<>();
        }

        customerReservations.add(reservation);
        reservations.put(customer.getEmail(), customerReservations);

        return reservation;

    }

    //
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return findRooms(checkInDate, checkOutDate);
    }


    public Collection<Reservation> getCustomersReservation(Customer customer) {
        return reservations.get(customer.getEmail());
    }

    public void printAllReservation() {
        final Collection<Reservation> reservations = getAllReservations();

        if (reservations.isEmpty()) {
            System.out.println("No reservations");
        } else {
            for (Reservation reservation: reservations) {
                System.out.println(reservation + "\n");
            }
        }

    }

    private Collection<Reservation> getAllReservations() {
        Collection<Reservation> reservationCollection = new ArrayList<>();

        for (Collection<Reservation> reservations1 : reservations.values()){
            reservationCollection.addAll(reservations1);
        }
        return reservationCollection;
    }

    private String customerReservation(){

    }
}
