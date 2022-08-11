package com.udacity.gmscholarship.model;


import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public enum RoomType {

    SINGLE("1"),
    DOUBLE("2");

    public final String numberOfBeds;

    private RoomType(String numberOfBeds){
        this.numberOfBeds = numberOfBeds;
    }

    public static RoomType choiceOfBeds(String numberOfBeds) {
        for (RoomType roomType : values()) {
            if (roomType.numberOfBeds.equals(numberOfBeds)) {
                return roomType;
            }
        }
        throw new IllegalArgumentException();
    }






    }









