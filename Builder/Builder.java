package Patterns.Builder;

public interface Builder {

    public void BuildHead();
    public void BuildTorso();
    public void BuildLegs();

    public Robot getRobot();
}
