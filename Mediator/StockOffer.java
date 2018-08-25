package Patterns.Mediator;

public class StockOffer {

    int stockShare=0;
    int colleagueCode=0;
    String stockSymbol="";

    StockOffer(int shares,int colleagueCode,String stockSymbol){

        this.colleagueCode=colleagueCode;
        this.stockShare=shares;
        this.stockSymbol=stockSymbol;


    }


    public int getStockShare() {
        return stockShare;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}
