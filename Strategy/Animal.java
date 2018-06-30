package Patterns.Strategy;

public class Animal {

    public String type="Animal";

    private Flys flyingAbility=null;



    public String getFlyingAbility(){

        return flyingAbility.TryToFly();

    }

    public void setFlyingAbility(Flys type){

        this.flyingAbility=type;
    }
}
