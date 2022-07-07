package com.company;

public class Carpet {
    private String colour;
    private int length;
    private int width;

    public Carpet(String colour, int length, int width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }
    public void describeCarpetColour(String colour) {
        System.out.println("This carpet is a beautiful shade of " + colour);
    }
    public String getColour() {
        return colour;
    }

    public int getHeight() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
