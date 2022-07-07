package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Barclays");

        bank.addNewBranch("Bangor");


        {
            System.out.println("Bangor branch created");
        }

        bank.addCustomer("Bangor", "Tim", 50.05);
        bank.addCustomer("Bangor", "Mike", 175.34);
        bank.addCustomer("Bangor", "Percy", 220.12);

        bank.addNewBranch("Lincoln");
        bank.addCustomer("Lincoln", "Bob", 150.54);

        bank.addCustomerTransaction("Bangor", "Tim ", 44.22);
        bank.addCustomerTransaction("Bangor", "Tim ", 12.44);
        bank.addCustomerTransaction("Bangor", "Mike ", 1.65);

        bank.printCustomerList("Bangor ", true);
        bank.printCustomerList("Lincoln ", true);

        bank.addNewBranch("Chester");

        if (!bank.addCustomer("Chester", "Brian", 5.53)) {
            System.out.println("Error Chester branch does not exist");
        }

        if (!bank.addNewBranch("Bangor")) {
            System.out.println("Bangor branch already exists");
        }

        if (!bank.addCustomerTransaction("Bangor", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Bangor", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}










