package com.company;

public class Door {
    private String material;
    private int height;
    private int width;

    public Door(String material, int height, int width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }


    public void openDoor(String material) {
        System.out.println("the " + material + " door has been opened");
    }


    public String getColour() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
