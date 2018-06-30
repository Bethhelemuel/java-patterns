package Patterns.Strategy;

public class Eagle extends Animal {


    public Eagle(){

        type="Eagle";
        setFlyingAbility(new ItFlys());
    }


}
