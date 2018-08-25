package Patterns.Mediator;

public class Test {

    public static void main(String[] args){

        StockMediator stockMediator= new StockMediator();

        GermanSlacks germanSlacks= new GermanSlacks(stockMediator);
        PTPoorman ptPoorman= new PTPoorman(stockMediator);


        germanSlacks.saleOffer("MSFT",100);
        germanSlacks.saleOffer("GOOG",50);

        ptPoorman.buyOffer("MSFT",100);
        ptPoorman.saleOffer("APPLE",10);

        germanSlacks.buyOffer("APPLE",10);
        germanSlacks.buyOffer("Game",10);


        stockMediator.getStockOfferings();

    }

}
