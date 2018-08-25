package Patterns.Builder;

public interface Builder {

    public void buildHead();
    public void buildTorso();
    public void buildLegs();

    public Robot getRobot();

}
