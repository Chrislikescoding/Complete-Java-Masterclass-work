package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int counter = 1;
        int total = 0;
                Scanner scanner = new Scanner(System.in);


        while (counter < 10) {

            System.out.println("Enter number " + counter + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                total =  total + scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle next line character (enter key)

        }
        System.out.println("Total is " + total + ";");
        scanner.close();
    }
}
