package Patterns.Adapter;

import java.util.Random;

public class Robot {

    private Random r= new Random();

    private int amount;
    public void walk(){
        amount=0;
        amount= r.nextInt(12)+15;

        System.out.println("Robot walks "+ amount+" spaces forward");
    }

    public void punch(){
        amount=0;
        amount= r.nextInt(4)+23;

        System.out.println("Robot punches and makes "+amount+" damage");
    }


    public void interActWithHuman(String name){


        System.out.println("Robot pushes "+ name);
    }
}
