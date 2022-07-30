package com.udacity.gmscholarship.model;

public interface IRoom {

    String  getRoomNumber();

    Double getRoomPrice();

    RoomType getRoomType();

    boolean isFree();
}
