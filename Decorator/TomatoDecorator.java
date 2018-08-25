package Patterns.Decorator;

public class TomatoDecorator implements Pizza {


    private Pizza pizza;

    public TomatoDecorator(Pizza pizza){

        this.pizza=pizza;

    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice()+20.00;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" ,tomato";
    }
}
