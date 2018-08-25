package Patterns.Facade;

public class Test {
    public static void main(String[] args){

            BethhelemuelBank bethhelemuelBank= new BethhelemuelBank(123456,1234);

            bethhelemuelBank.deposit(2000);
            bethhelemuelBank.withdraw(2110);
    }
}
