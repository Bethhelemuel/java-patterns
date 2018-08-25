package Patterns.Adapter;

public class Tank implements TankActions {


    @Override
    public void fire() {
        System.out.println("Tank fires ");
    }

    @Override
    public void moveForward() {
        System.out.println("Tank moves ");
    }

    @Override
    public void assignDrive(String name) {
        System.out.println("Tank has been assigned to  "+ name);
    }
}
