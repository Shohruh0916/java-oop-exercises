package example05;

class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    InvoiceItem(String id,String desc, int qty , double unitPrice){
        this.desc=desc;
        this.id=id;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    String getId(){
        return id;
    }

    String getDesc(){
        return  desc;
    }

    int getQty(){
        return qty;
    }

    void setQty(int qty){
        this.qty= qty;
    }

    double getUnitPrice(){
        return  unitPrice;
    }

    void setUnitPrice(double unitPrice){
        this.unitPrice= unitPrice;
    }

    double getTotal(){
        return  unitPrice*qty;
    }

    public String toString() {
        return id+" "+desc+" "+qty+" "+unitPrice;
    }
}

