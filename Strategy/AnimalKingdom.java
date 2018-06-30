package Patterns.Strategy;

public class AnimalKingdom {


    public static void main(String[] args){

        Lion leon=new Lion();
        Eagle jet= new Eagle();


        System.out.println(" ----------------------- ");
        System.out.println("Animal type "+ jet.type );
        System.out.println("Flying Ability : "+jet.type+" "+ jet.getFlyingAbility() );

        System.out.println();

        System.out.println(" ----------------------- ");
        System.out.println("Animal type "+ leon.type );
        System.out.println("Flying Ability "+ leon.type+" "+ leon.getFlyingAbility() );

        System.out.println();

        System.out.println(" ----------------------- ");

    }
}
