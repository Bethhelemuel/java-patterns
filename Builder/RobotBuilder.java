package Patterns.Builder;

public class RobotBuilder {

    Builder builder;

    public RobotBuilder(Builder builder){

        this.builder=builder;
        this.buildRobot();
    }

    private void buildRobot(){

        this.builder.BuildHead();
        this.builder.BuildLegs();
        this.builder.BuildTorso();
    }


    public Robot getRobot(){

        return  builder.getRobot();
    }
}
