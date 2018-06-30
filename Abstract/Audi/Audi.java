package Patterns.Abstract.Audi;

import Patterns.Abstract.Car;
import Patterns.Abstract.CarFactory;

public class Audi extends Car {

    private CarFactory carFactory;

    public Audi(CarFactory carFactory){

      this.carFactory=carFactory;

    }

    @Override
    protected void makeCar() {

            engine=carFactory.addEngine();
            exterior=carFactory.addBody();
            interior=carFactory.addInterior();

    }
}
