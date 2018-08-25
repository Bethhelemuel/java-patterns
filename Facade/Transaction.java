package Patterns.Facade;

public class Transaction {


    private double balance=1000;


    public void withdraw(double amount){

        if(amount < balance ){

            balance=balance-amount;

            System.out.println("Transaction successful");
            System.out.println(" balance : "+balance);
        }
    }

    public  void deposit(double amount){

        balance=balance+amount;

        System.out.println("Transaction successful");
        System.out.println(" balance : "+balance);
    }

}
