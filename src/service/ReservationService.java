package service;


import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class  ReservationService{

    //Static variable reference of Single_instance
    private static ReservationService single_instance = null;

    //Private constructor restricting class to itself
    private ReservationService(){}

    //Static method to create an instance of ReservationService
    public static ReservationService getInstance(){
        if (single_instance == null) {
            single_instance = new ReservationService();
        }
        return getInstance();
    }



    public void addRoom(IRoom room){

    }

    public  IRoom getARoom(String roomId){
        return getARoom(roomId);
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return reserveARoom(customer,room,checkInDate,checkOutDate);
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        return new HashSet<>();
    }

    public Collection<Reservation> getCustomersReservation(Customer customer){

        return getCustomersReservation(customer);
    }

    public void printAllReservation() {
        System.out.println();
    }






}
