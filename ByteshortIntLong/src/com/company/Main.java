package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        byte mybyteValue = 100;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        byte byteVariable = 80;
        short shortVariable= 1000;
        int intVariable =  2000;
        Long longVariable = 50000L + 10L * (byteVariable +shortVariable + intVariable);

        System.out.println("sum = " + byteVariable +shortVariable + intVariable);

        System.out.println("Long variaile = " + longVariable);

    }
}
