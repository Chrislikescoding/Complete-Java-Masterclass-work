package com.company;

public class Carpet {

    private double cost = 0;
    public Carpet(double cost) {

        if (cost<0) {
            cost = 0;
        }

        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
