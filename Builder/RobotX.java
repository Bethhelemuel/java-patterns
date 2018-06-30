package Patterns.Builder;

public class RobotX implements  Builder{

    private Robot r;

    public RobotX(){

        this.r= new Robot();
    }

    @Override
    public void BuildHead() {

        r.setHead("Robot X Super --head");
    }

    @Override
    public void BuildTorso() {

        r.setTorso("Robot X torso Platinum ");
    }

    @Override
    public void BuildLegs() {

        r.setLegs("Robot X  super gold legs");

    }

    @Override
    public Robot getRobot() {
        return r;
    }
}
