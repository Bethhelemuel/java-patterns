package Patterns.Abstract;

public abstract class CarBuilder {



    protected abstract Car makeCar(String type);

    public Car create(String type){

        Car c= makeCar(type);

        c.makeCar();


        return c;
    }
}
