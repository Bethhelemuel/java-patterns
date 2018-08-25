package Patterns.Proxy;

public class ATMProxy implements GetATMData {
    @Override
    public ATMState getATMData() {
        ATMMachine atm= new ATMMachine();
        return atm.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine atm= new ATMMachine();
        return atm.getCashInMachine();
    }
}
