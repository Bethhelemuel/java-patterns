package Patterns.Prototype;

public class CloneFactory {


    public static Clone getClone(Sheep sheep){

        return sheep.makeCopy();
    }
}
