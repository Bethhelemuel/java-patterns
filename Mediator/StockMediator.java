package Patterns.Mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockSellOffers;
    private ArrayList<StockOffer>stockBuyOffers;

    private int colleagueCode=0;

    public StockMediator(){

        colleagues= new ArrayList<>();
        stockSellOffers=new ArrayList<>();
        stockBuyOffers= new ArrayList<>();
    }

    public void addColleugue(Colleague colleague) {

        colleagues.add(colleague);
        colleagueCode++;
        colleague.setCollCode(colleagueCode);
    }

    @Override
    public void saleOffer(String stock, int shares, int coll) {

        boolean stockSold=false;

        for(StockOffer offer: stockBuyOffers){

            if((offer.getStockSymbol() == stock) &&(offer.getStockShare()== shares)){

                System.out.println(shares+ " shares of "+ stock+ " sold to colleague code "+offer.getColleagueCode());

                stockBuyOffers.remove(offer);
                stockSold=true;
            }

            if(stockSold){break;}
        }

        if(!stockSold){

            System.out.println(shares+" share of "+stock+" added to inventory");
            StockOffer newOffering= new StockOffer(shares,coll,stock);

            stockSellOffers.add(newOffering);
        }
     }


    public void buyOffer(String stock, int shares, int coll) {
        boolean stockBought=false;

        for(StockOffer offer: stockSellOffers){

            if((offer.getStockSymbol() == stock) &&(offer.getStockShare()== shares)){

                System.out.println(shares+ " shares of "+ stock+ " bought  by colleague code "+offer.getColleagueCode());

                stockSellOffers.remove(offer);
                stockBought=true;
            }

            if(stockBought){break;}
        }

        if(!stockBought){

            System.out.println(shares+" share of "+stock+" added to inventory");
            StockOffer newOffering= new StockOffer(shares,coll,stock);

            stockBuyOffers.add(newOffering);
        }
    }

    public void getStockOfferings(){
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("Stocks for sale");
        System.out.println("--------------------");
        for(StockOffer o: stockSellOffers){

            System.out.print(o.getStockShare() +" of "+o.getStockSymbol() );



        }



        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("Stocks buy offers");
        System.out.println("--------------------");
        for(StockOffer o: stockBuyOffers){

            System.out.println(o.getStockShare() +" of "+o.getStockSymbol() );
        }

    }


}
