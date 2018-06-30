package Patterns.Visitor;

public class Black implements  Visitable {

    private double tax=30;

    private double item;

    public Black(double item){

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
