package Patterns.Abstract.Audi;

import Patterns.Abstract.*;

public class Audi extends Car {


    public Audi(CarFactory carFactory) {
        super(carFactory);
    }

    @Override
    public void makeCar() {

        carEngine=carFactory.getEngine();
        carInterior=carFactory.getInterior();
        carExterior=carFactory.getExterior();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
