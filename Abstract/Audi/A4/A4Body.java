package Patterns.Abstract.Audi.A4;

import Patterns.Abstract.CarBody;

public class A4Body implements CarBody {


    @Override
    public String get() {
        return "Audi S line body with aluminum rims ";
    }
}
