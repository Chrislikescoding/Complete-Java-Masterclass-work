package com.company;

import java.util.ArrayList;

public class Customer {
    private  String customerName;
    private  double initialTransaction;
    private ArrayList<Double> transactions;

    public Customer( String customerName, double initialTransaction) {
           this.customerName = customerName;
           this.transactions = new ArrayList<Double>();
           addTransaction(initialTransaction);
        }


    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

   // public void setTransactions(ArrayList<Double> transactions) {
     //   this.transactions = transactions;
   //}
    public boolean addTransaction(double amount) {

       this.transactions.add(amount);
                return true;
    }
  // public static Customer createCustomer( String branch, String customerName, double transaction){
   //    return new Customer( customerName, transaction);
 //   }


    //public boolean addNewTransaction(Customer customer, double transaction) {
    //    if (findCustomer(customer) >= 0) {
    ////        customer.addTransaction(transaction);
     //       System.out.println("transaction added " + transaction +  " " + transactions.size());
    //        return true;
      //  }
     //   return true;
   // }



}
