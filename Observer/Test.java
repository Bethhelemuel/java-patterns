package Patterns.Observer;

public class Test {


    public static void main(String[] args){

            StockGrabber stockGrabber= new StockGrabber();
            StockObserver stockObserver= new StockObserver(stockGrabber);


            stockGrabber.setApplePrice(10000);
            stockGrabber.setGooglePrice(6300);
            stockGrabber.setIbmPrice(5000);

    }
}
