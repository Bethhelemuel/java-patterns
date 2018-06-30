package Patterns.Observer;

public class StockObserver implements  Observer {

    private double ibm;
    private double google;
    private double apple;

    private static int Tracer=0;
    private int observerID;


    private StockGrabber stockGrabber;

    public StockObserver(StockGrabber stockGrabber){

        this.stockGrabber=stockGrabber;
        this.observerID=++Tracer;

        stockGrabber.register(this);
        System.out.println("---------- Observer "+this.observerID+" ------------" );

    }
    @Override
    public void update(double ibm, double google, double apple) {

        this.ibm=ibm;
        this.google=google;
        this.apple=apple;

        System.out.println( " ");
        System.out.println(" IBM : " + this.ibm );
        System.out.println(" Google : " + this.google );
        System.out.println(" apple : " + this.apple );
        System.out.println( " ");
    }
}
