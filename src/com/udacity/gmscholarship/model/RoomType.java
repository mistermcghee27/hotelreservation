package com.udacity.gmscholarship.model;


import java.util.Random;
import java.util.Scanner;

public enum RoomType {
        SINGLE(1), DOUBLE(2);

    public static Scanner scanner;
        final int roomType;

        RoomType(int roomType) {
            Scanner scanner1 = new Scanner(System.in);
            this.roomType = roomType;

        }
    }









