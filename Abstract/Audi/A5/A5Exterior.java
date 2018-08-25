package Patterns.Abstract.Audi.A5;

import Patterns.Abstract.CarExterior;

public class A5Exterior implements CarExterior {
    @Override
    public String request() {
        return "Cherry red gloss";
    }
}
