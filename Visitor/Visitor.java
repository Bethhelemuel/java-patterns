package Patterns.Visitor;

public interface Visitor {

    public double visit(Black price);
    public double visit(White price);
    public double visit(Indian price);

}
