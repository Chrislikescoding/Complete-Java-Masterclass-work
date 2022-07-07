package com.company;


public class Main {

    public static void main(String[] args) {
        //  System.out.println("main 1 " + getEvenDigitSum(2000));
        // System.out.println("has shared digit " + hasSharedDigit(22, 11));
        /// System.out.println("common divisor " + getGreatestCommonDivisor(12, 30));
        //  printFactors(32);
        // System.out.println("perfect " + isPerfectNumber(26));
        // numberToWords(10);
        // System.out.println(getLargestPrime(45));
        printSquareStar(10);

    }

    public static int sumDigits(int number) {

        int total = 0;
        if ((number < 10) || (number < 0))
            return -1;
        else {

            while (number >= 10) {
                total += number % 10;
                number /= 10;
            }
            total = total + number;
        }
        return total;
    }

    public static int getEvenDigitSum(int number) {

        int digit = 0;
        int total = 0;
        if (number < 0)
            return -1;
        else {

            while (number > 0) {

                digit = number % 10;

                if (number % 2 == 0) {
                    total += digit;
                }

                number /= 10;
            }
        }
        return total;
    }

    public static boolean hasSharedDigit(int from, int end) {
        System.out.println("from" + from);

        int digit = 0;

        if (from < 10 || from > 99) {
            System.out.println("one");
            return false;
        } else if (end < 10 || end > 99) {
            System.out.println("two");
            return false;
        } else

            while (from > 0) {

                int digitFrom = from % 10;
                int digitTo = end % 10;

                System.out.println("from " + from + " end " + end + " digit " + digit);
                if (digitFrom == digitTo) {
                    return true;
                }
                from /= 10;
                end /= 10;
            }
        return false;
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {


        if (isValid(first) && isValid(second) && isValid(third)) {

            int digitFirst = first % 10;
            int digitSecond = second % 10;
            int digitThird = third % 10;


            if ((digitFirst == digitSecond) || (digitFirst == digitThird) || (digitThird == digitSecond)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {

        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    // write your code here
    public static int getGreatestCommonDivisor(int one, int two) {

        int divisor = 0;

        if ((one < 10) || (two < 10)) {
            return -1;
        } else if (one > two)
            divisor = one;
        else
            divisor = two;

        while (divisor > 0) {

            if ((one % divisor == 0) && (two % divisor == 0)) {
                return divisor;
            }

            divisor--;
        }
        return -1;
    }


    public static void printFactors(int one) {

        int divisor = 1;
        String text = " ";

        if (one < 1) {
            System.out.println("Invalid Factor");
        } else

            while (divisor > 0) {

                if (one % divisor == 0) {
                    text = text + divisor + " ";
                }

                divisor++;
            }
        System.out.println(text);
    }

    public static boolean isPerfectNumber(int one) {

        int divisor = 1;
        int sum = 0;

        if (one < 1) {
            return false;
        } else

            while (divisor > 0 && divisor < one) {

                if (one % divisor == 0) {
                    sum = sum + divisor;
                }
                divisor++;
                if (sum == one)
                    return true;
            }
        return false;
    }

    public static void numberToWords(int number) {

        String printNumber = "";

        int count = getDigitCount(number);
        int reversedNumber = reverse(number);
        String name = " ";

        for (int i = 0; i < count; i++) {
            int lastDigit = reversedNumber % 10;
            if (reversedNumber < 0) {
                System.out.println("Invalid Value");
            } else

                switch (lastDigit) {
                    case 1:
                        name = "One";
                        break;
                    case 2:
                        name = "Two";
                        break;
                    case 3:
                        name = "Three";
                        break;
                    case 4:
                        name = "Four";
                        break;
                    case 5:
                        name = "Five";
                        break;
                    case 6:
                        name = "Six";
                        break;
                    case 7:
                        name = "Seven";
                        break;
                    case 8:
                        name = "Eight";
                        break;
                    case 9:
                        name = "Nine";
                        break;
                    case 0:
                        name = "Zero";
                        break;
                }
            reversedNumber /= 10;
            printNumber = name + " " + printNumber;
        }
        System.out.println(printNumber);
    }


    public static int reverse(int number) {

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
            System.out.println("reverse " + reverse);
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int length = 1;
        if (number < 0)
            return -1;
        else
            for (int count = 1; number > 0; count++) {
                number = number / 10;
                length = count;
                ;
            }
        return length;
    }


    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }


  //  public static void printSquareStar(int number) {
  //      if (number < 5)
  //          System.out.println("Invalid Value");
  //      else{
  //          for (int row = 0; row < number; row++) {
  //              for (int column = 0; column < number; column++) {
  //                  if (row == 0 || row == number - 1 || column == 0 || column == number - 1 || column == row || column == number - 1 - row)System.out.print("*");
//
  //                  else System.out.println(" ");

 //               }
 //               System.out.println(" ");
 //       }
 //   }


    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}

