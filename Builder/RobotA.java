package Patterns.Builder;

public class RobotA implements  Builder{

    private Robot r;

    public RobotA(){

        this.r= new Robot();
    }

    @Override
    public void BuildHead() {

        r.setHead("Robot A head");
    }

    @Override
    public void BuildTorso() {

        r.setTorso("Robot A torso");
    }

    @Override
    public void BuildLegs() {

        r.setLegs("Robot A legs");

    }

    @Override
    public Robot getRobot() {
        return r;
    }
}
