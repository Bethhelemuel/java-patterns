package Patterns.Prototype;

public class Sheep implements Clone {



    public Sheep (){

        System.out.println("Sheep has been created id : "+System.identityHashCode(this));
    }

    @Override
    public Clone makeCopy() {

        Sheep sheepClone= null;

        try {
            sheepClone=(Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Sheep Clone has been created id : "+System.identityHashCode(sheepClone));


        return sheepClone;
    }
}
