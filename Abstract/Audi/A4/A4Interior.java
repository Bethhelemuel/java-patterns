package Patterns.Abstract.Audi.A4;

import Patterns.Abstract.CarInterior;

public class A4Interior implements CarInterior {
    @Override
    public String get() {
        return "Audi A4";
    }
}
