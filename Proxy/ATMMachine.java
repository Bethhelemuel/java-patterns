package Patterns.Proxy;

public class ATMMachine implements GetATMData {

    ATMState hasCard,noCard,atmOutOfMoney,hasPin;

    ATMState state;

    boolean hasCorrectPin;
    int amountInAtm=4000;


    public ATMMachine(){

        hasCard= new HasCard(this);
        noCard= new NoCard(this);
        atmOutOfMoney=new ATMOutOfMoney(this);
        hasPin= new HasPin(this);

        state=noCard;

        if(amountInAtm<0){

            state=atmOutOfMoney;
        }
    }


    public void insertCard(){this.state.insertCard();}
    public void insertPin(int pin){this.state.insertPin(pin);}
    public void requestCash(int amount){this.state.requestCash(amount);}
    public void ejectCard(){this.state.ejectCard();}


    public void setAtmState(ATMState state){
        this.state=state;
    }


    @Override
    public ATMState getATMData() {
        return state;
    }

    @Override
    public int getCashInMachine() {
        return amountInAtm;
    }
}
