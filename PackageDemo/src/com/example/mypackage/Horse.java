package com.example.mypackage;
//import com.company.ISaveable;

import java.util.ArrayList;
import java.util.List;

public class Horse implements ISaveable{



        private  String horseName;
        private String breed;
        private int age;
        private String colour;


    public Horse(String horseName, String breed, int age, String colour) {
        this.horseName = horseName;
        this.breed = breed;
        this.age = age;
        this.colour = colour;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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

    public String getHorseName() {
            return horseName;
        }


    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.horseName);
        values.add(1,this.breed);
        values.add(2, " " + this.age);
        values.add(3,this.colour);
        return values;
    }

    @Override
    public void read(List<String> values) {
        for (int i=0; i<values.size(); i++){
            System.out.println("Element  " + i + " " + values.get(i));
        }
    }
}

