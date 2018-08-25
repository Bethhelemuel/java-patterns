package Patterns.Abstract;

public abstract class Car {

    public CarEngine carEngine;
    public CarExterior carExterior;
    public CarInterior carInterior;

    public String name;

    public void setName(String name){this.name=name;}
    public  CarFactory carFactory;

    public Car(CarFactory carFactory){

        this.carFactory=carFactory;
    }



    public  String displayInfo(){
        return "Name : "+name
                +"\nEngine : "+carEngine.request()
                +"\nInterior : "+carInterior.request()
                +"\nExterior : "+carExterior.request();

    }





    public abstract void makeCar();
}
