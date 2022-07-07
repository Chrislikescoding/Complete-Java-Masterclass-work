package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth :");
        int yearOfBirth=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name :" );
        String name = scanner.nextLine();

        int age = 2021 - yearOfBirth;

        System.out.println("Your name is "  + name + " and your age is " + age) ;
        scanner.close();
	// write your code here
    }
}
