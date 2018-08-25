package Patterns.Abstract.Audi.A5;

import Patterns.Abstract.CarInterior;

public class A5Interior implements CarInterior {
    @Override
    public String request() {
        return "Dracula black seats with red stitching";
    }
}
