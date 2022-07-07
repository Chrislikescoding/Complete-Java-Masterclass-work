package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAccount = new BankAccount();
        myAccount.depositFunds(10.51);
        myAccount.depositFunds(10.51);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Bob", 25000 );
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Chris", 5000,"Chris@email.com" );
        System.out.println(person3.getCustomerName());

    }
}
