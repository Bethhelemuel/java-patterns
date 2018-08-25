package Patterns.Prototype;

public class Test {


    public static void main(String[] args){

        Sheep gunther= new Sheep();

        Sheep guyntherClone=(Sheep) CloneFactory.getClone(gunther);

    }

}
