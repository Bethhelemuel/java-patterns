package Patterns.Strategy;

public class Lion extends Animal {

    public Lion(){

        type="Lion";
        setFlyingAbility(new CantFly());
    }


}
