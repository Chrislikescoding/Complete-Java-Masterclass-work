package com.company;

import javax.management.monitor.Monitor;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet("red", 10, 8);
        Door door = new Door("wooden", 7, 3);

        GlassWindow glassWindow = new GlassWindow("south");

        Bed bed = new Bed("single");

        Room room = new Room(door, glassWindow, carpet, bed);
        room.openUp();
        room.getDoor().openDoor("wooden");
    }
}
