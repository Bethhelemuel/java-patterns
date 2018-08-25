package Patterns.Proxy;

public class Test {


    public static void main(String[] args){


        GetATMData atmMachine= new ATMMachine();
//
//        atmMachine.insertCard();
//        atmMachine.insertPin(1234);
//        atmMachine.requestCash(2000);
//        atmMachine.ejectCard();
//        atmMachine.insertCard();
//        atmMachine.insertPin(1234);
//        atmMachine.requestCash(200);


        GetATMData atmProxy= new ATMProxy();




        System.out.println(atmMachine.getATMData());


    }
}
