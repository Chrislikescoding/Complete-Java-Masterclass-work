package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;




public class Main {

            private static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
              int[] myIntegers = getIntegers(5);


                sortIntegers(myIntegers);
                printArray(myIntegers);

            }
            public static int[] sortIntegers(int[] number) {

              int [] values = number;
              Integer [] intValues = new Integer[5];

                for(int i=0; i<values.length; i++) {
                    intValues[i] = values[i];
                }
                Arrays.sort(intValues, Collections.reverseOrder());

                for(int i=0; i<values.length; i++) {
                    values[i] = intValues[i];
                }

                return values;
            }

            public static int[] getIntegers(int number) {
                System.out.println("Enter " + number + " integer values.\r");
                int[] values = new int[number];

                for(int i=0; i<values.length; i++) {
                    values[i] = scanner.nextInt();
                }

                return values;
            }

            public static void printArray(int[] array) {
                int sum = 0;
                for(int i=0; i< array.length; i++) {
                    System.out.println("Element " + i +", typed value was " + array[i]);
                }

            }


        }


