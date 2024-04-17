package org.example;

import org.example.Account;

public class LoanAccount extends Account {

    private double loanAmount;
    private double interestRate;
    private double totalPayments;
    private double interest_payed;



    LoanAccount(String _accountType, double _loanAmount, double _interest) {
        this.accountType = _accountType;
        this.balance = _loanAmount;
        this.loanAmount = _loanAmount;
        if(_interest < 1){
        this.interestRate = _interest;}
        else{
            System.out.println("Interst must be in decimal form and under 1");
        }

    }




    @Override
    public boolean withdraw(double amount) {
        if((this.loanAmount - this.balance) >= amount){
            this.balance = this.balance + amount;
        }
        else{
            System.out.println("Insufficient funds to Withdraw");
            return false;
        }
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        if(this.balance > 0 && balance >= amount) {
            double interestPayment = this.balance * interestRate;
            interest_payed += interestPayment;
            this.balance = this.balance - (amount - interestPayment);
            this.totalPayments += amount;

        }
        else{

        //set the restrictions so that the person is not overpaying
            System.out.println("Invalid deposit Amount");
            return false;
        }

        return true;
    }


    @Override
    public String toString() {
        String content = "";
        content = content + "The Account Type is : " + this.accountType +"\r\n";
        content = content = "The total Amount Payed: " + totalPayments+ "\r\n";
        content = content + "The Principle Payed thus far is : " + (this.loanAmount - this.balance) +"\r\n";
        //display how much interest has been paid
        content = content + "The Interest Payed thus far is : " + (interest_payed) + "\r\n";
        content = content + "The Amount Remaining is : " + (this.balance);
        //display how much interest has been paid
        return content;
    }
}
