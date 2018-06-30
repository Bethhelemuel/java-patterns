package Patterns.Adapter;

public class Test {


    public static void main(String[] args){

        Tank t10x= new Tank();
        Robot robotX= new Robot();

        RobotAdapter robotAdapter=new RobotAdapter(robotX);

        TankControls tankControls= new TankControls(robotAdapter);


        tankControls.attack();
        tankControls.moveForward();
        tankControls.assignDriver("John");
    }
}
