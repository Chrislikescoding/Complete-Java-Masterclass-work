package com.company;

import java.util.ArrayList;

public class Branch {

    private  String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }
    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) ==  null)  {
            this.branchCustomers.add(new Customer(customerName, initialAmount));
            return true;
        }
      return false;
    }

    public boolean addNewTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);

            return true;
        }
        return false;
    }
    //private Customer findCustomer(Customer customer) {
     //   return this.branchCustomers.indexOf(customer);
   //    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            Customer checkedCustomer = this.branchCustomers.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }


}
