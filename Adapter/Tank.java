package Patterns.Adapter;

import java.util.Random;

public class Tank implements  TankActions {

    private Random r= new Random();
    private int amount;
    @Override
    public void driveForward() {
        amount=0;
        amount= r.nextInt(110)+1200;

        System.out.println("Tank moves "+amount+" spaces forward ");


    }

    @Override
    public void shootCannon() {
        amount=0;
        amount= r.nextInt(56)+12;

        System.out.println("Tank shoots and makes "+amount+" damage ");
    }

    @Override
    public void assignDriver(String driver) {

        System.out.println("Tank has been assigned to "+ driver);


    }
}
