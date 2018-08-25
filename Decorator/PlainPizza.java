package Patterns.Decorator;

public class PlainPizza implements Pizza {



    @Override
    public double getPrice() {
        return 20.00;
    }

    @Override
    public String getDescription() {
        return "plain dough";
    }
}
