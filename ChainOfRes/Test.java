package Patterns.ChainOfRes;

public class Test {

    public static void main(String[] args){

        Add add= new Add();
        Subtract subtract= new Subtract();
        Divide divide= new Divide();
        Multiply multiply= new Multiply();


        ChainSetup.chainSetup(add,subtract,divide,multiply);


        Numbers numbers= new Numbers(54,16,"multiply");

        add.calculate(numbers);

    }
}
