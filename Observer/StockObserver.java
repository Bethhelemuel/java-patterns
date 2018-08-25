package Patterns.Observer;

public class StockObserver implements Observer {

    int google,apple,ibm;
    private Subject subject;

    int observerNum=0;

    public StockObserver(Subject s){

        s.register(this);

        observerNum++;
        System.out.println("Observer added  id :"+observerNum);


    }

    @Override
    public void update(int google, int apple, int ibm) {

        this.google=google;
        this.apple=apple;
        this.ibm=ibm;

        this.print();
    }

    public void print(){

        System.out.println(" google "+google);
        System.out.println(" apple "+apple);
        System.out.println(" ibm "+ibm);
    }
}
