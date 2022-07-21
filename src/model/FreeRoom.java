package model;

import java.util.Objects;

public class FreeRoom extends Room {

    private String roomNumber;
    private Double price;

    //Single or Double bed room enum.
    private RoomType roomType;


    //Default constructor
    public FreeRoom(){

    }

//Change the constructor to set the price to $0
public FreeRoom(String roomNumber, RoomType roomType){
    this.roomNumber = roomNumber;
    price = 0.0;
    this.roomType = roomType;

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
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeRoom freeRoom = (FreeRoom) o;
        return roomNumber.equals(freeRoom.roomNumber) && price.equals(freeRoom.price) && roomType == freeRoom.roomType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, price, roomType);
    }

    @Override
    public String toString() {
        return "Room Number: "+ roomNumber+" "+
                "Price: "+ price+" "+
                "Room Type: "+ roomType;
    }
}