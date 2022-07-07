    package com.company;

    public class Main {

            public static void main(String[] args) {
                Circle circle = new Circle(3.75);
                System.out.println("Circle Radius = " + circle.getRadius());
                System.out.println("Circle Radius = " + circle.getArea());
                Cylinder cylinder = new Cylinder(5.55, 7.25);
                System.out.println("cylinder Radius = " + cylinder.getRadius());
                System.out.println("cylinder height = " + cylinder.getHeight());
                System.out.println("cylinder area = " + cylinder.getArea());
                System.out.println("cylinder volume  = " + cylinder.getVolume());


            }
    }
