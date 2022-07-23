package api;

import model.Customer;
import model.IRoom;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class AdminResource {
    private static AdminResource single_instance = null;

    private AdminResource(){}

    public static AdminResource getInstance(){
        if (single_instance == null) {
            single_instance = new AdminResource();
        }
        return getInstance();
    }

    public Customer getCustomer(String email){
        return getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms){

    }

    public Collection<IRoom> getAllRooms(){
        return null;
    }

    public Collection<Customer> getAllCustomers(){
        return getAllCustomers();
    }

    public void displayAllReservations(){

    }
}
