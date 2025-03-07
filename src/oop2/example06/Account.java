package oop2.example06;

class Account {
    String id;
    String name;
    int balance=0;

    Account(String id, String  name){
        this.id=id;
        this.name=name;
    }

    Account(String id,String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    String  getId(){
        return id;
    }

    String  getName(){
        return name;
    }

    int getBalance(){
        return  balance;
    }

    int credit(int amount){
        balance+=amount;
        return  balance;
    }

    int debit(int amount){
        if(amount<=balance){
            balance-=amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return  balance;
    }

    int transferTo(Account another,int amount){
        if(amount<=balance){
            balance-=amount;
            another.credit(amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return  balance;
    }

    public String toString() {
        return  id+" "+name+" "+balance;
    }
}
