package Patterns.Facade;

public class Account {


    private boolean checkAccountNumber(int account) {

        if (account == 123456) {

            return true;
        } else {
            return false;
        }
    }


    public void checkAccount(int account){

        if(this.checkAccountNumber(account)){

            System.out.println("Account number correct");
        }
    }

}
