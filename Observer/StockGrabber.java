package Patterns.Observer;

import java.util.ArrayList;

public class StockGrabber implements  Subject {


    int google,apple,ibm;

    public void setGoogle(int google) {
        this.google = google;
        this.notifyObservers();
    }

    public void setApple(int apple) {
        this.apple = apple;
        this.notifyObservers();
    }

    public void setIbm(int ibm) {
        this.ibm = ibm;
        this.notifyObservers();
    }

    ArrayList<Observer> observers;


    public StockGrabber(){

            observers= new ArrayList<>();

    }

    @Override
    public void register(Observer o) {
    observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
    observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(Observer o:observers){

            o.update(google,apple,ibm);
        }
    }
}
