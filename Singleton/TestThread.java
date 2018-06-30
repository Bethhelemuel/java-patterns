package Patterns.Singleton;

public class TestThread {


    public static void main(String[] args){

    Runnable getTile1= new GetTiles(3);
    Runnable getTile2= new GetTiles(10);


    new Thread(getTile1).start();
    new Thread(getTile2).start();

    }
}
