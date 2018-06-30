package Patterns.Strategy;

public interface Flys {

    public String TryToFly();

}


class CantFly implements  Flys{


    @Override
    public String TryToFly() {
        return " cant fly ";
    }
}



class ItFlys implements  Flys{


    @Override
    public String TryToFly() {
        return " is flying high ";
    }
}
