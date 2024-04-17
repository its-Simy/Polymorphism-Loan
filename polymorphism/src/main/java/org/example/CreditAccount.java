package org.example;

public class CreditAccount extends Account {
    private double creditLimit;

    CreditAccount(String _accountType, double creditLimit){
        this.accountType = _accountType;
        this.balance = 0;
        this.creditLimit = creditLimit;
    }


    public void setCreditLimit(double creditLimit){
        creditLimit = creditLimit;
    }

    @Override
    public boolean withdraw(double _amount) {

        if((this.creditLimit - this.balance) >= _amount){
            this.balance = this.balance + _amount;
            return true;
        }
        else{
            System.out.println("The amount is greater than the remaining balance");
            return false;
        }

    }

    @Override
    public boolean deposit(double amount) {
        if (this.balance <= 0) {
            this.balance = 0;
            System.out.println("Credit is payed off");
            return false;
        } else if (this.balance < amount) {
            System.out.println("The balance is less than amount you are trying to pay");
            System.out.println(this.toString());
            return false;
        } else {
            this.balance = this.balance - amount;
            return true;
        }
    }

    @Override
    public String toString() {
        String content = "Remaining fund: " + (this.creditLimit - this.balance)+ "\r\n";
        content = content + super.toString();
        return content;


    }
}
