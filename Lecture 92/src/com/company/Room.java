package com.company;

import javax.management.monitor.Monitor;
import javax.swing.*;
import java.awt.*;

public class Room {

        private Door door;
        private GlassWindow glassWindow;
        private Carpet carpet;
        private Bed bed;


    public Room(Door door, GlassWindow glassWindow, Carpet carpet, Bed bed) {
        this.door = door;
        this.glassWindow = glassWindow;
        this.carpet = carpet;
        this.bed = bed;

    }

    public void openUp(){
        getDoor().openDoor("wooden") ;
        printCurtainState();
    }



    private void printCurtainState (){
        glassWindow.windowFacing("east");
        System.out.println("Curtains are drawn open");
    }
    public Door getDoor() {
        return door;
    }


}
