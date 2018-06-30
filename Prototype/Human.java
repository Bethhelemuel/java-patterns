package Patterns.Prototype;

public class Human implements Clone{


    public Human(){

        System.out.println("Human class created "+ System.identityHashCode(this) );


    }

    @Override
    public Clone makeCopy() {

        Human humanClone=null;

        try {
            humanClone=(Human)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Human clone class created "+ System.identityHashCode(humanClone) );


        return humanClone;
    }
}
