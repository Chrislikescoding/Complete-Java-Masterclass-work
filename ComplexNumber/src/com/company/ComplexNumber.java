package com.company;

public class ComplexNumber {

    private double real=0;
    private double imaginary = 0;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){

        this.real += real;
        this.imaginary += imaginary;


    }
    public void add(ComplexNumber cNumber) {

        this.real += cNumber.real;
        this.imaginary += cNumber.imaginary;
    }

    public void subtract (double real, double imaginary){

        this.real -= real;
        this.imaginary -= imaginary;


    }
    public void subtract(ComplexNumber cNumber) {

        this.imaginary -= cNumber.imaginary;
        this.real -= cNumber.real;
    }


}

