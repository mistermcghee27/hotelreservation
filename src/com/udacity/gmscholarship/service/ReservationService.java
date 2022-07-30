package com.udacity.gmscholarship.service;


import com.udacity.gmscholarship.model.Customer;
import com.udacity.gmscholarship.model.IRoom;
import com.udacity.gmscholarship.model.Reservation;
import com.udacity.gmscholarship.model.Room;

import java.util.*;
import java.util.concurrent.Callable;

public class  ReservationService{

    //Static variable reference of Single_instance
    private static ReservationService single_instance = null;

    private final Map<String, IRoom> rooms = new HashMap<>();

    private final Map<String, Collection<Reservation>> reservations = new HashMap<>();


    //Private constructor restricting class to itself
    private ReservationService(){}

    //Static method to create an instance of ReservationService
    public static ReservationService getInstance(){
        if (single_instance == null) {
            single_instance = new ReservationService();
        }
        return single_instance;
    }



    public void addRoom(final IRoom room){
        rooms.put(room.getRoomNumber(), room);
    }

    public  IRoom getARoom(String roomId){
        return rooms.get(roomId);
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room ,checkInDate, checkOutDate);

        Collection<Reservation> customerReservations = getCustomersReservation(customer);


        if (customerReservations == null) {
            customerReservations = new LinkedList<>();
        }

        customerReservations.add(new Reservation());
        reservations.put(customer.getEmail(), customerReservations);
        return reservation;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        for (Iterator iterator = reservations.values().iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();

        }
        return null;
    }


    public Collection<Reservation> getCustomersReservation(Customer customer){

        return reservations.get(customer.getEmail());
    }

    public void printAllReservation() {
        final Collection<Reservation> reservations = getAllReservations();

        if (reservations.isEmpty()) {
            System.out.println("No reservations");
        }else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation + "\n");
            }
        }

    }

    private Collection<Reservation> getAllReservations() {
        final Collection<Reservation> allReservations = new LinkedList<>();

        for(Collection<Reservation> reservations : reservations.values()) {
            allReservations.addAll(reservations);
        }
        return allReservations;
    }


    public Collection<IRoom> getAllRooms() {
        return rooms.values();
    }
}
