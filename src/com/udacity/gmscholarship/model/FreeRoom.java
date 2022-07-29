package com.udacity.gmscholarship.model;

import java.util.Objects;

public class FreeRoom extends Room {

    private String roomNumber;
    private Double price;

    //Single or Double bed room enum.
    private RoomType numberOfBeds;


//Change the constructor to set the price to $0
public FreeRoom(String roomNumber, RoomType numberOfBeds){
    super(roomNumber,0.0,numberOfBeds);

}

//getters and setters


    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public void setRoomPrice(Double price) {
        this.price = price;
    }

    @Override
    public RoomType getRoomType() {
        return numberOfBeds;
    }

    @Override
    public void setRoomType(RoomType numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeRoom freeRoom = (FreeRoom) o;
        return roomNumber.equals(freeRoom.roomNumber) && price.equals(freeRoom.price) && numberOfBeds == freeRoom.numberOfBeds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, price, numberOfBeds);
    }

    @Override
    public String toString() {
        return "Room Number: "+ roomNumber+" "+
                "Price: "+ price+" "+
                "Room Type: "+ numberOfBeds;
    }
}