package Patterns.Visitor;

public class Tax implements Visitor {


    private double  tax=1.9;

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
