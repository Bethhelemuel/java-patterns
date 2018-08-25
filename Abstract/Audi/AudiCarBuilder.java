package Patterns.Abstract.Audi;

import Patterns.Abstract.Audi.A5.A5Factory;
import Patterns.Abstract.Car;
import Patterns.Abstract.CarBuilder;
import Patterns.Abstract.CarFactory;

public class AudiCarBuilder extends CarBuilder {


    @Override
    public Car makeCar(String car) {
       Car model=null;


       if(car.equals("A5")){

           CarFactory a5Factory= new A5Factory();

           model= new Audi(a5Factory);
           model.setName("Audi A5");
       }



       return model;
    }
}
