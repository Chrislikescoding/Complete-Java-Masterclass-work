package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your c
    inputThenPrintAndSumAverage();
    }

    public static void inputThenPrintAndSumAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number= 0;
    //    long average = 0;
        int count = 0;

        while (true) {

            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                number = scanner.nextInt();

                sum += number;
                count++;

            } else {
                break;
            }

            scanner.nextLine(); // handle next line character (enter key)

        }
        double average   =  (double) sum / (double)count;

        System.out.println("SUM = " +    sum + " AVG " + Math.round(average) );
            scanner.close();

    }
}
