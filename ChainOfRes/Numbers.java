package Patterns.ChainOfRes;

public class Numbers {


    int num1;
    int num2;
    String calculation;
    public Numbers(int num1,int num2,String calculation ){

        this.num1=num1;
        this.num2=num2;
        this.calculation=calculation;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getCalculation() {
        return calculation;
    }
}
