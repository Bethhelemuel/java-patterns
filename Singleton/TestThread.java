package Patterns.Singleton;

public class TestThread {

    public static void main(String[] args){

        Runnable player1= new GetTiles(14);
        Runnable player2= new GetTiles(2);


        new Thread (player1).start();
        new Thread (player2).start();

    }
}
