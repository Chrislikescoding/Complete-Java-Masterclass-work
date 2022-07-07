package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isOdd(2));
        System.out.println(isOdd(3));
        System.out.println(sumOdd(1, 10));
        System.out.println("test " + getBucketCount( 3.4,2.1, 1.5,2));
    }

    public static int getDaysinMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year < 9999) {
            return -1;
        }


        int switchMonth = month;
        switch (switchMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }


    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {   //step 1
                if (year % 100 == 0) { //step 2
                    if (year % 400 == 0) { //step 3
                        return true;  // step 4
                    }

                    return false;
                }

                return true;
            }

            return false;

        }
        return false;
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if (number % 2 == 0)
            return false;
        else
            return true;
    }


    public static int sumOdd(int start, int end) {
        int total = 0;

        if (start < 1 || end < start) {
            return -1;
        }

            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {
                    total = total + i;
                }
            }
            return total;

    }

    public static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets) {
        double result = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else{
           result= (((width * height) / (areaPerBucket))  - extraBuckets);
        }
        return (int) Math.round(result);
    }
    public static int getBucketCount(double width,double height, double areaPerBucket) {
        double result = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else{
            result= (((width * height) / (areaPerBucket)) );
        }
        return (int) Math.round(result);
    }
}