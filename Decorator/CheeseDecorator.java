package Patterns.Decorator;

public class CheeseDecorator implements Pizza {


    private Pizza pizza;

    public CheeseDecorator(Pizza pizza){

        this.pizza=pizza;

    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice()+20.00;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+" ,cheese";
    }
}
