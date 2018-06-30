package Patterns.Abstract.Audi;

import Patterns.Abstract.Audi.A4.A4Factory;
import Patterns.Abstract.Car;
import Patterns.Abstract.CarBuilder;
import Patterns.Abstract.CarFactory;

public class AudiCarBuilder extends CarBuilder {


    @Override
    protected Car makeCar(String type) {

        Car car= null;

        if(type == "A4"){


            CarFactory fac= new A4Factory();
            car=new Audi(fac);
            car.setName(type);

        }

        return car;
    }
}
