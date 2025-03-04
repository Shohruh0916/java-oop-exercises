package account;
class Account {
    int id;
    double balance;
    double annualInterestRate;

    Account(){
        this.annualInterestRate=0;
        this.balance=0;
        this.id=0;
    }

    Account (double balance,double annualInterestRate,int id){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    void getMonthlyInterestRate(){
        System.out.println("getMonthlyInterest:"+annualInterestRate/12);
    }

    void getMonthlyInterest(){
        System.out.println("getMonthlyInterest:"+balance*annualInterestRate/100);
    }

    void withdraw(int a){
        if (a>balance) {
            System.out.println("Insufficient balance!");
        }else{
            balance-=a;
        }
    }

    void deposit(int b){
        balance+=b;
    }
}
