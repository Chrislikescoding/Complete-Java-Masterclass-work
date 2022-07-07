package com.example.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Donkey implements ISaveable{

        private  String donkeyName;
        private int age;
        private String colour;

    public String getDonkeyName() {
        return donkeyName;
    }

    public void setDonkeyName(String donkeyName) {
        this.donkeyName = donkeyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Donkey(String donkeyName, int age, String colour) {
        this.donkeyName = donkeyName;
        this.age = age;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Donkey{" +
                "donkeyName='" + donkeyName + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
    @Override
    public List<String> write() {
        List<String> donkeyValues = new ArrayList<String>();
        donkeyValues .add(0,this.donkeyName);
        donkeyValues .add(1, " " + this.age);
        donkeyValues .add(2,this.colour);
        return donkeyValues;

    }

    @Override
    public void read(List<String> values) {
        for (int i=0; i<values.size(); i++){
            System.out.println("Element  " + i + " " + values.get(i));
        }

    }
}
