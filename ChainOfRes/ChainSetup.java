package Patterns.ChainOfRes;

public class ChainSetup {


    public static void chainSetup(Chain chain1,Chain chain2,Chain chain3,Chain lastChain){

        chain1.nextChain(chain2);
        chain2.nextChain(chain3);
        chain3.nextChain(lastChain);

    }
}
