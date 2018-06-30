package Patterns.Visitor;

public class Indian implements  Visitable{

    private double tax=15;

    private double item;

    public Indian(double item){

        this.item=item;

    }

    public double getPrice(){

        return tax*item;
    }


    @Override
    public double set(Visitor v) {

       return  v.visit(this);
    }
}
