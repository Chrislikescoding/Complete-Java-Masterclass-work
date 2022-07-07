package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int accountNo;

     
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setSecondName(String email){
        this.email = email;
    }
    public String getemail(){
        return this.email;
    }
    public void setAccountNo (int accountNo) {
                   this.accountNo = accountNo;
    }
    public int getAccountNo() {
        return this.accountNo;
    }
    public void setBalance (double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void depositFunds(double amount) {
        this.balance +=amount;
        System.out.println("deposited to balance " + balance);
    }
    public void withdrawFunds(double amount) {

        if (this.balance -amount < 0){
            System.out.println("insufficient funds " + amount + " was NOT withdrawn from balance.Available amount is " + this.balance) ;
            }else {
            this.balance -=amount;
            System.out.println("withdrawn from balance " + balance);
        }
    }
}
