package Patterns.Builder;

public class Test {

    public static void main(String[] args){

        RobotX robotX= new RobotX();
        RobotA robotA= new RobotA();


        RobotBuilder robotABuilder= new RobotBuilder(robotA);
        RobotBuilder robotXBuilder= new RobotBuilder(robotX);


        Robot robot= robotABuilder.getRobot();

        System.out.println("---------------------------------------");

        System.out.println("Robot head : "+ robot.getHead());
        System.out.println("Robot torso : "+ robot.getTorso());
        System.out.println("Robot legs : "+ robot.getLegs());

        System.out.println("---------------------------------------");

    }
}
