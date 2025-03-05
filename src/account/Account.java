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

    double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    double getMonthlyInterest(){
        return balance*annualInterestRate/100;
    }

    double withdraw(int a){
        return balance=-a;
    }

    double deposit(int a){
        return balance+=a;
    }
}
