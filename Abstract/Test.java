package Patterns.Abstract;

import Patterns.Abstract.Audi.AudiCarBuilder;

public class Test {

    public static void main(String[] args){

           CarBuilder carBuilder= new AudiCarBuilder();

           Car car= carBuilder.makeCar("A5");

           car.displayInfo();

    }

}
