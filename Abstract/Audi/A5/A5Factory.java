package Patterns.Abstract.Audi.A5;

import Patterns.Abstract.CarEngine;
import Patterns.Abstract.CarExterior;
import Patterns.Abstract.CarFactory;
import Patterns.Abstract.CarInterior;

public class A5Factory implements CarFactory {
    @Override
    public CarEngine getEngine() {
        return new A5Engine();
    }

    @Override
    public CarInterior getInterior() {
        return new A5Interior();
    }

    @Override
    public CarExterior getExterior() {
        return new A5Exterior();
    }
}
