package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
     private ArrayList<Branch> bankBranches;


    public Bank(String name) {
        this.name = name;
        this.bankBranches = new ArrayList<Branch>();
    }



    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.bankBranches.add(new Branch(branchName));
            return true;
        }
        return false;
    }


    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewTransaction(customerName, amount);
        }
        return false;
    }



    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.bankBranches.size(); i++) {
            Branch checkedBranch = this.bankBranches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean printCustomerList(String branchName,boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getBranchCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer:" +
                        branchCustomer.getCustomerName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount" + transactions.get(j));
                    }

                }
            }
            return true;
        } else{
         return false;
        }
    }

}

