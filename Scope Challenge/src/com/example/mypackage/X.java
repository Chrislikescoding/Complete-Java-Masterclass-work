package com.example.mypackage;

import java.util.Scanner;

public class X {
    int x = 0;

    public void x(int a) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        this.x=scanner.nextInt();
               for (int x = 1; x <= 12; x++) {
               System.out.println(x + " times " + this.x + " is " + (x* this.x ));
        }
        scanner.close();

    }
}
