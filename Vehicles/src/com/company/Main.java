package com.company;

public class Main {

    public static <myCar> void main(String[] args) {
	// write your code here
       // Car myCar = new Car();
       // myCar.increaseSpeed(10);
        HondaJazz hJ = new HondaJazz (6);
        hJ.steer(45);
        hJ.accelerate(30);
        hJ.accelerate(20);
        hJ.accelerate(-42);


    }
}
