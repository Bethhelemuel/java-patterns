package Patterns.Abstract.Audi.A4;

import Patterns.Abstract.CarBody;
import Patterns.Abstract.CarEngine;
import Patterns.Abstract.CarFactory;
import Patterns.Abstract.CarInterior;

public class A4Factory implements CarFactory {

    @Override
    public CarEngine addEngine() {
        return new A4Engine();
    }

    @Override
    public CarInterior addInterior() {
        return new A4Interior();
    }

    @Override
    public CarBody addBody() {
        return new A4Body();
    }
}
