package Patterns.Singleton;

public class GetTiles implements  Runnable {
    int tiles;

    public GetTiles(int tiles){

        this.tiles=tiles;

    }

    @Override
    public void run() {

        Singleton instance= Singleton.getInstance();


        System.out.println(" ");
        System.out.println(instance.getNumberList());
        System.out.println(" ");


        System.out.println("instance "+ System.identityHashCode(instance));

        System.out.println(instance.getNumbers(this.tiles));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

    }
}
