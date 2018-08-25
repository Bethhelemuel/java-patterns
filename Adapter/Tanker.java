package Patterns.Adapter;

public class Tanker {

    private TankActions tankActions;

    public Tanker(TankActions tankActions){

        this.tankActions=tankActions;

    }


    public void fire(){

        this.tankActions.fire();
    }

    public void moveForward(){

        this.tankActions.moveForward();
    }

    public void assignDrivver(String name){

        this.tankActions.assignDrive(name);
    }
}
