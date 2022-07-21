package model;

import service.CustomerService;

import javax.print.attribute.standard.DateTimeAtProcessing;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        //customer tester
        Customer customer = new Customer("first", "second", "j@email.com");
        System.out.println(customer);

        //room tester
        Room room1 = new Room("101", 150.00,RoomType.SINGLE);
        System.out.println(room1);

        //FreeRoom tester
        FreeRoom freeRoom = new FreeRoom("100",RoomType.DOUBLE);
        System.out.println(freeRoom);

        //Reservation tester
        Reservation reservation = new Reservation(customer,room1,new Date(),new Date());
        System.out.println(reservation);


    }
}
