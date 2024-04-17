package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LoanAccount loan1 = new LoanAccount("Loan",50,.10);
        loan1.deposit(55);
        System.out.println(loan1.toString());

        System.out.println();

        LoanAccount loan2 = new LoanAccount("Loan",50,.10);
        loan2.deposit(15);
        System.out.println(loan2.toString());

        System.out.println();

        LoanAccount loan3 = new LoanAccount("Loan",50,.10);
        loan3.deposit(20);
        System.out.println(loan3.toString());
        System.out.println();
        loan3.withdraw(5);
        System.out.println(loan3.toString());


    }
}