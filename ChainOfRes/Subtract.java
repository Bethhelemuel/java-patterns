package Patterns.ChainOfRes;

public class Subtract implements  Chain{

    private Chain chain;


    @Override
    public void calculate(Numbers numbers) {

        if(numbers.calculation.equals("subtract")){

                System.out.println(numbers.getNum1()+" - "+numbers.getNum2()+" = "
                +(numbers.getNum1()-numbers.getNum2()));
        }else{

            chain.calculate(numbers);
        }
    }

    @Override
    public void nextChain(Chain chain) {
        this.chain=chain;
    }
}
