package Patterns.Adapter;

public class RobotAdapter implements TankActions{

   private Robot robot;

   public RobotAdapter(Robot r){

       this.robot= r;
   }

    @Override
    public void driveForward() {


        robot.walk();
    }

    @Override
    public void shootCannon() {

       robot.punch();
    }

    @Override
    public void assignDriver(String driver) {

       robot.interActWithHuman(driver);

    }
}
