package com.udacity.gmscholarship.model;

import java.util.Objects;

public class Room implements IRoom {

    private String roomNumber;
    private Double price;

    //Single or Double bedroom enum.
    private RoomType numberOfBeds;

    public Room(String roomNumber, Double price, RoomType numberOfBeds) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getRoomPrice() {
        return price;
    }

    public void setRoomPrice(Double price) {
        this.price = price;
    }

    public RoomType getRoomType() {
        return numberOfBeds;
    }

    public void setRoomType(RoomType numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isFree(){
        return true;
    }



    @Override
    public String toString() {
        return "Room Number: " + getRoomNumber()+" "+
                "Room Price: " + getRoomPrice() +" "+
                "Room Type: " + getRoomType();

    }

    @Override
    public boolean equals(Object obj) {
        // if this object is equal to its self return true.
        if (this == obj) {
            return true;
        }
        //next check to see if the parameter instance is null.
        if (obj == null) {
            return false;
        }
        //third make we have two instances from the same class
        if (obj instanceof Room room) {
            //cast the instance to the class we're testing.
            //check every attribute
            return Objects.equals(room.roomNumber, this.roomNumber) && Objects.equals(room.price, this.price) && room.numberOfBeds == numberOfBeds;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, price, numberOfBeds);
    }





}
