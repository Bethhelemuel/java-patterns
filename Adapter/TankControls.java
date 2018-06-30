package Patterns.Adapter;

public class TankControls {


    private TankActions tankActions;

    public TankControls(TankActions tankActions){

        this.tankActions= tankActions;
    }


    public void moveForward(){

        tankActions.driveForward();
    }


    public void attack(){

        tankActions.shootCannon();
    }


    public void assignDriver(String driver){

        tankActions.assignDriver(driver);
    }
}
