package Patterns.Builder;

public class Test {


    public static void main(String[] args){

        RobotA robotA= new RobotA();
        RobotX robotX= new RobotX();


        RobotFactory robotFactory= new RobotFactory(robotX);

        Robot robot= (Robot)robotFactory.getRobot();

        System.out.println("-------------- Robot -------------");
        System.out.println(" ");
        System.out.println("Robot head "+robot.getRobotHead());
        System.out.println("Robot torso "+robot.getRobotTorso());
        System.out.println("Robot legs "+robot.getRobotLegs());
        System.out.println(" ");
        System.out.println("---------------------------------- ");
    }

}
