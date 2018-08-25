package Patterns.Mediator;

public abstract class Colleague {

Mediator mediator;
int colleagueCode;


Colleague(Mediator m){

    this.mediator=m;
    mediator.addColleugue(this);
}

void saleOffer(String stock,int share){

    mediator.saleOffer(stock,share,this.colleagueCode);
}

void buyOffer(String stock,int share){

    mediator.buyOffer(stock,share,this.colleagueCode);
}

public void setCollCode(int collCode){colleagueCode=collCode;}


}
