package stock;

class Stock {
    String symbol;
    String name;
    double praviousClosingPrice;
    double currentPrice;

    Stock(double currentPrice,double praviousClosingPrice,String name,String symbol){
        this.currentPrice=currentPrice;
        this.name=name;
        this.symbol=symbol;
        this.praviousClosingPrice=praviousClosingPrice;
    }

    void getChangePrecent(){
        System.out.println(((currentPrice - praviousClosingPrice) / praviousClosingPrice) * 100);
    }


}
