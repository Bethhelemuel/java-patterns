package Patterns.Abstract;

import Patterns.Abstract.Audi.AudiCarBuilder;

public class Testing {

    public static void main(String[] args){

       CarBuilder carBuilder= new AudiCarBuilder();
       //CarBuilder carBuilder= new BMWCarBuilder();
       //CarBuilder carBuilder= new BMWCarBuilder();


        Car car= carBuilder.create("A4");

        System.out.println(car.displayCar());
    }
}
