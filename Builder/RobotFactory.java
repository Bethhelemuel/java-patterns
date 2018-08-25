package Patterns.Builder;

public class RobotFactory {

    private Builder robotBuilder;


    public RobotFactory(Builder robotBuilder){

        this.robotBuilder=robotBuilder;

        this.create();
    }

    private void create(){

        this.robotBuilder.buildHead();
        this.robotBuilder.buildTorso();
        this.robotBuilder.buildLegs();
    }

    public Robot getRobot(){

        return this.robotBuilder.getRobot();
    }
}
