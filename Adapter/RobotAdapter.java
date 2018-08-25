package Patterns.Adapter;

public class RobotAdapter implements TankActions {

    private Robot robot;


    public RobotAdapter(Robot r){

        this.robot=r;
    }

    @Override
    public void fire() {

        this.robot.punch();
    }

    @Override
    public void moveForward() {

        this.robot.walk();
    }

    @Override
    public void assignDrive(String name) {

        this.robot.assignHuman(name);
    }
}
