package Patterns.ChainOfRes;

public class Multiply implements  Chain{

    private Chain chain;


    @Override
    public void calculate(Numbers numbers) {

        if(numbers.calculation.equals("multiply")){

                System.out.println(numbers.getNum1()+" x "+numbers.getNum2()+" = "
                +(numbers.getNum1()*numbers.getNum2()));
        }else{

        System.out.println("incorrect calculation type");
        }
    }

    @Override
    public void nextChain(Chain chain) {
        this.chain=chain;
    }
}
