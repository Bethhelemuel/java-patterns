package Patterns.Proxy;

public class ATMOutOfMoney implements ATMState {


    private ATMMachine atmMachine;


    public ATMOutOfMoney(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("ATM out of money ");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM out of money ");

    }

    @Override
    public void insertPin(int pin) {

        System.out.println("ATM out of money ");

    }

    @Override
    public void requestCash(int cash) {

        System.out.println("ATM out of money ");


    }
}
