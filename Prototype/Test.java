package Patterns.Prototype;

public class Test {


    public static void main(String[] args){

        Human adam= new Human();

        Human adamClone = (Human)adam.makeCopy();

    }
}
