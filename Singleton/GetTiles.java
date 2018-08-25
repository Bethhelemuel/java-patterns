package Patterns.Singleton;

public class GetTiles implements Runnable{


   private int number;

   public GetTiles(int number){

       this.number=number;


   }

    @Override
    public void run() {
        Player player=Player.getInstance();


        System.out.println(" ");
        System.out.println("----------------------------------------------------------- ");
        System.out.println(player.getNumberList());
        System.out.println("id "+ System.identityHashCode(player));

        System.out.println("---------------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("Player  ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Player  "+player.getTiles(number));
    }
}
