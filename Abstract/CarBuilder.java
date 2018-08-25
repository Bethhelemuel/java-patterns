package Patterns.Abstract;

public abstract class CarBuilder {



    public abstract Car makeCar(String car);


    public Car createCar(String car){

        Car model=null;

        model=makeCar(car);


        return  model;
    }
}
