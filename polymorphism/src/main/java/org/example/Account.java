package org.example;


public abstract class Account {
    protected String accountType;
    protected double balance;
    /*Account(String _accountType, double _balance){
        this.AccountType = _accountType;
        this.Balance = _balance;
    }*/
    public abstract boolean withdraw(double amount);
    public abstract boolean deposit(double amount);

    @Override
    public String toString() {
        String content = "";
        content = content + "The Account Type is : " + this.accountType +"\r\n";
        content = content + "The Account Balance is : " + this.balance;
        return content;
    }
}



