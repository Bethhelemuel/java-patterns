package Patterns.Visitor;

public class HolidayTax implements Visitor {


    private double  tax=.3;

    @Override
    public double visit(Black price) {
        return Math.round(tax*price.getPrice());
    }

    @Override
    public double visit(White price) {
        return Math.round(tax*price.getPrice());
    }

    @Override
    public double visit(Indian price) {
        return Math.round(tax*price.getPrice());
    }
}
