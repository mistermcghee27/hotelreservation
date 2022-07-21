package model;

public class Room implements IRoom {

    private String roomNumber;
    private Double price;

    //Single or Double bed room enum.
    private RoomType roomType;



    //Default constructor
    public Room() {

    }


    public Room(String roomNumber, Double price, RoomType roomType){
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;

        /*if (roomType == RoomType.SINGLE){
            System.out.println(RoomType.SINGLE);
        } else {
            System.out.println(RoomType.DOUBLE);
        }*/

    }


    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void getRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room Number: " + getRoomNumber()+" "+
                "Room Price: " + getRoomPrice() +" "+
                "Room Type: " + getRoomType() +" "+
                "Open: " + isFree();
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {

        return price;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public boolean isFree() {
        return true;
    }

    public static void main(String[] args) {


    }
}
