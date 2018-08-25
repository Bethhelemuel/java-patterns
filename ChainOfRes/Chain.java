package Patterns.ChainOfRes;

public interface Chain {

    public void calculate(Numbers numbers);
    public void nextChain(Chain chain);
}
