package Patterns.Proxy;

public class HasCard implements ATMState {


    private ATMMachine atmMachine;


    public HasCard(ATMMachine atmMachine){
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

        if(pin == 1234){

            System.out.println("pin correct\n------------- balance is "+atmMachine.amountInAtm+"------------------");
            atmMachine.hasCorrectPin=true;
            atmMachine.setAtmState(atmMachine.hasPin);
        }else{

            atmMachine.hasCorrectPin=false;
            System.out.println("incorrect pin ..");
            ejectCard();
        }

    }

    @Override
    public void requestCash(int cash) {

        System.out.println("insert pin first");


    }
}
