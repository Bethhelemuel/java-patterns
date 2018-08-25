package Patterns.Proxy;

public class NoCard implements ATMState {


    private ATMMachine atmMachine;


    public NoCard(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {

        atmMachine.setAtmState(atmMachine.hasCard);
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert Card");

    }

    @Override
    public void insertPin(int pin) {

        System.out.println("Please insert Card");

    }

    @Override
    public void requestCash(int cash) {

        System.out.println("Please insert Card");


    }
}
