package Patterns.Observer;

public class Test {

    public static void main(String[] args){

        StockGrabber stockGrabber= new StockGrabber();



        StockObserver stockObserver= new StockObserver(stockGrabber);
        StockObserver stockObserver2= new StockObserver(stockGrabber);


        stockGrabber.setApple(50);
        stockGrabber.setGoogle(100);
        stockGrabber.setIbm(20);
    }
}
