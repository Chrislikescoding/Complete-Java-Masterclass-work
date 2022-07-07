package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double twenty = 20.00;
        double forty = 80.00;

        double result = (twenty + forty) * 100;
        System.out.println("Result is " + result);

        double newResult = result % 40;
        System.out.println("New result is " + newResult);

        boolean remainder = false;
        if (newResult == 0) {
            remainder = true;
        }

        //boolean noRemainder = (remainder == 0) ? true:false;
        System.out.println("Boolean is " + remainder);

        //boolean wascar = iscar : true:false
        if (!remainder) {
            System.out.println("Got some remainder");
        }
    }
}
