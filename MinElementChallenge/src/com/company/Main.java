    package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] returnedArray = readIntegers(6);
        System.out.println(" minimum = value is " + findMin(returnedArray));
	// write your code here
    }

    private static int[] readIntegers(int count) {

        System.out.println("Enter " + count + " integer values.\r");

        int[] values = new int[count];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {

        int [] values = array;
        int temp = values[0];

        for(int i=0; i<values.length;  i++) {

            if(values[i] < temp) temp = values[i];


        }


        return temp;




    }
}
