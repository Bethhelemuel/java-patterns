package Patterns.Abstract;

public abstract class Car {

    public String name;

   public  CarEngine engine;
   public CarInterior interior;
   public CarBody exterior;

    protected abstract void makeCar();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String displayCar(){


        return " Car : "+this.getName()+"\n"+interior.get()+"\n"+exterior.get()+"\n"+engine.get();
    }





}
