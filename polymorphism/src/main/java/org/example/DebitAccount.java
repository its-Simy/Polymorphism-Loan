package org.example;

public class DebitAccount extends Account {
    DebitAccount(String _accountType, double _balance) {
        //the following initializes the account type and the balance from the parent class
        // because there in a constructor in the parent class
        //super(_accountType, _balance);

        this.accountType = _accountType;
        this.balance = _balance;

    }

    @Override
    public boolean deposit(double _amount){
        if (_amount > 0) {
            this.balance = this.balance + _amount;
        }
        else{
            System.out.println("Incorrect Amount");
            return false;
        }
        return true;
    }


    @Override
    public boolean withdraw(double _amount){
        if (_amount > 0 && _amount <= this.balance){
            this.balance = this.balance - _amount;
        }
        else{
            System.out.println("Incorrect Amount or Insufficient Balance");
            return false;
        }
        return true;
    }


    //takes the balance of the account type and of the balance to print it to the screen
    @Override
    public String toString(){ return super.toString(); }


}



