package account;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(20000,4.5,1122);
        account.getMonthlyInterestRate();
        account.getMonthlyInterest();
        account.withdraw(2500);
        account.deposit(3000);
    }
}
