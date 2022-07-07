package com.company;

public class VipCustomer {


    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("default name",1000.00, "defaultEmail");
        System.out.println(" constructor 1 called");
    }


    public VipCustomer(String name, double limit ) {
        this(name,limit,"defaultEmail");
        System.out.println("constructor 2 called");
    }
    public VipCustomer(String name, double limit,String email){
        this.customerName=name;
        this.creditLimit=limit;
        this.emailAddress=email;

        System.out.println("constructor 3 called");
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
