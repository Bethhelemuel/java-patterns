package Patterns.Facade;

public class BethhelemuelBank {

   private Welcome welcome;
    private Pin pin;
    private Account account;
    private Transaction transaction;

   private int accountNumber,accountPin;

    public BethhelemuelBank(int accountNumber,int pinNumber){

        this.welcome=new Welcome();
        this.pin = new Pin();
        this.account=new Account();
        this.transaction= new Transaction();

        this.accountNumber=accountNumber;
        this.accountPin=pinNumber;

        this.checkAccount();
        this.checkPin();
    }

    private void checkPin(){

      pin.checkPin(accountPin);
    }

    private void checkAccount(){

    account.checkAccount(accountNumber);

    }

    public void deposit(double amount){

                transaction.deposit(amount);
    }

    public void withdraw(double amount ){

                transaction.withdraw(amount);
    }
}
