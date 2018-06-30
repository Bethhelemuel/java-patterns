package Patterns.Observer;

import java.util.ArrayList;

public class StockGrabber implements  Subject {

    ArrayList<Observer> observers;

    private double ibm;
    private double google;
    private double apple;


    public StockGrabber(){

        observers= new ArrayList<Observer>();
    }


    @Override
    public void register(Observer o) {

        observers.add(o);

    }

    @Override
    public void unregister(Observer o) {

        int location=observers.indexOf(o);

        observers.remove(location);

    }

    @Override
    public void notifyObserver() {

        for(Observer o : observers){

            o.update(this.ibm,this.google,this.apple);
        }

    }


    public void setIbmPrice(double ibm) {
        this.ibm = ibm;
        notifyObserver();
    }

    public void setGooglePrice(double google) {
        this.google = google;
        notifyObserver();
    }

    public void setApplePrice(double apple) {
        this.apple = apple;
        notifyObserver();
    }
}
