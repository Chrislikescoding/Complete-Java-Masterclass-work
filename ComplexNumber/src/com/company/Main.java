package com.company;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);


        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        System.out.println("two.real = " + two.getReal());
        System.out.println("two.imaginary = " + two.getImaginary());
        one.add(3,3);
        one.add(two);

	// write your code here
    }
}
