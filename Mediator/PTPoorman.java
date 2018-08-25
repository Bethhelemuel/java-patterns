package Patterns.Mediator;

public class PTPoorman extends Colleague {

    PTPoorman(Mediator m) {
        super(m);

        System.out.println("PT Poorman has registered");
    }
}
