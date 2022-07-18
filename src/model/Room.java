package model;

public class Room implements IRoom {

    private String roomNumber;
    private Double price;

    //Single or Double bed room enum.
    RoomType Single = RoomType.Single;
    RoomType Double = RoomType.Double;

    //Default constructor
    public Room() {

    }

    public Room(String roomNumber, Double price){
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public java.lang.Double getPrice() {
        return price;
    }

    public void setPrice(java.lang.Double price) {
        this.price = price;
    }

    public RoomType getSingle() {
        return Single;
    }

    public void setSingle(RoomType single) {
        Single = single;
    }

    public RoomType getDouble() {
        return Double;
    }

    public void setDouble(RoomType aDouble) {
        Double = aDouble;
    }

    @Override
    public String toString() {
        return "Room Number:" + getRoomNumber()+"Room Price"+ getRoomType() + "Room Type" + getRoomType() + "Open" + isFree();
    }

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public java.lang.Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
