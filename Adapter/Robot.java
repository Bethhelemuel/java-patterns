package Patterns.Adapter;

public class Robot {


    public void walk(){

        System.out.println("Robot walks");
    }


    public void punch(){

        System.out.println("Robot punches");
    }


    public void assignHuman(String name){

        System.out.println("Robot has been assigned to "+ name);
    }
}
