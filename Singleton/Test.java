package Patterns.Singleton;

public class Test {


    public static void main(String[] args){

        Player player= Player.getInstance();
        Player player2= Player.getInstance();

        System.out.println(player.getNumberList());
        System.out.println(" ");
        System.out.println("Player 1 ");
        System.out.println(" ");
        System.out.println("Player 1 "+player.getTiles(14));
        System.out.println(" ");System.out.println(" ");System.out.println(" ");
        System.out.println("Player 2 ");
        System.out.println(" ");
        System.out.println("Player 2 "+player.getTiles(4));
    }
}
