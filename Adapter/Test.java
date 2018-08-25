package Patterns.Adapter;

public class Test {


    public static void main(String[] args){


        Tank tank= new Tank();
        Robot robot= new Robot();
        RobotAdapter robotAdapter= new RobotAdapter(robot);


        Tanker tanker= new Tanker(robotAdapter);

            tanker.fire();
            tanker.moveForward();
            tanker.assignDrivver("John");

    }
}
