package Patterns.Singleton;

public class Test {

    public static void main(String[] args){

Singleton instance1= Singleton.getInstance();
Singleton instance2= Singleton.getInstance();


System.out.println(" ");
        System.out.println("---------------------------------------------------");

System.out.println(instance1.getNumberList());
        System.out.println("---------------------------------------------------");

System.out.println(" ");

System.out.println("First instance "+ System.identityHashCode(instance1));

        System.out.println(instance1.getNumbers(2));

System.out.println(" ");
System.out.println(" ");
System.out.println(" ");



System.out.println("Second instance "+ System.identityHashCode(instance2));
        System.out.println(instance2.getNumbers(11));
    }
}
