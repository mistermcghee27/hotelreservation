package model;

public class FreeRoom extends Room {
private Double price;

//Change the constructor to set the price to $0
    public FreeRoom(Double price) {
         price = 0.0;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price: "+getPrice();
    }
}
