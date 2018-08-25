package Patterns.Proxy;

public class HasPin implements ATMState {


    private ATMMachine atmMachine;


    public HasPin(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("Cant add more than one card !");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejecting please wait....");
        atmMachine.setAtmState(atmMachine.noCard);

    }

    @Override
    public void insertPin(int pin) {

            System.out.println("Already has pin");

    }

    @Override
    public void requestCash(int cash) {

        if(atmMachine.hasCorrectPin){

            atmMachine.amountInAtm=atmMachine.amountInAtm-cash;

            System.out.println("Transaction complete");

        }else{

            System.out.println("the pin dawg");
        }

    }
}
