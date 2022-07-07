package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code
            int [] array = {1,5,3,7,11,9,15};
        reverse(array);
    }
    private static void reverse (int [] array){
        int j = array.length;

        int reverse [] = new int [j];

        for (int i = 0; i<array.length; i++) {
            reverse[j-1] = array[i];
            j--;

        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " +  Arrays.toString(reverse));

    }


}
