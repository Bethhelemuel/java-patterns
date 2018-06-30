package Patterns.Visitor;

public class White implements Visitable {

    private double tax=6;

    private double item;

    public White(double item){

        this.item=item;

    }

    public double getPrice(){

        return tax*item;
    }


    @Override
    public double set(Visitor v) {

      return   v.visit(this);
    }
}
