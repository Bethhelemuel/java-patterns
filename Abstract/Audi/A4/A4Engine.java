package Patterns.Abstract.Audi.A4;

import Patterns.Abstract.CarEngine;

public class A4Engine implements CarEngine {
    @Override
    public String get() {
        return "A4 3 cylinder v6 tfsi engine";
    }
}
