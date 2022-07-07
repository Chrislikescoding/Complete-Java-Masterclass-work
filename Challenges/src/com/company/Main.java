package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(0,5,4));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigKilos = bigCount*5;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            System.out.println(("1 bigKilos " + bigKilos  + "smallcount " + smallCount));
            return false;}
        else
            if (bigKilos + smallCount == goal){
            System.out.println(("2 bigKilos " + bigKilos  + "smallcount " + smallCount));
            return true;}
        else
            if (bigKilos + smallCount < goal)
            System.out.println(("1 bigKilos " + bigKilos  + "smallcount " + smallCount));
            else
                if (bigKilos + smallCount > goal){
                System.out.println(("24 bigKilos " + bigKilos  + "smallcount " + smallCount));
                return true;}
        else
            while (bigKilos > 0) {
                bigKilos -= 5;
                System.out.println(("bigKilos " + bigKilos  + "smallcount " + smallCount));
                if (bigKilos + smallCount == goal)
                    return true;
            }
        return false;
    }
}

