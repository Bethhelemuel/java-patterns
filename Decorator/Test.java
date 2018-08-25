package Patterns.Decorator;

public class Test {

    public static void main(String[] args){

        Pizza pizza= new TomatoDecorator(new CheeseDecorator(new TomatoDecorator(new PlainPizza())));

        System.out.println("Description : "+pizza.getDescription());
        System.out.println("Cost : "+pizza.getPrice());
    }
}
