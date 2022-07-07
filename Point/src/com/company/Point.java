package com.company;

public class Point {
    private int x  = 0;
    private int y  = 0;


    public Point (int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
       return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public double distance() {
        return Math.sqrt( (getX() - 0.0) * ( getX() - 0)  + (getY() - 0) * (getY() - 0));
    }

    public double distance(int x, int y) {
        return Math.sqrt( (getX() - x) * ( getX() - x)   + (getY() - y) * (getY() - y));
    }
    public double distance(Point z) {
        return Math.sqrt( (getX() - z.getX()) * ( getX() - z.getX())   + (getY() - z.getY()) * (getY() - z.getY()));
    }
}
