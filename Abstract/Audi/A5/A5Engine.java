package Patterns.Abstract.Audi.A5;

import Patterns.Abstract.CarEngine;

public class A5Engine implements CarEngine {
    @Override
    public String request() {
        return "TFSI sline engine";
    }
}
