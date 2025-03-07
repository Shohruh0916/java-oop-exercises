package oop1.account;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(20000,4.5,1122);
        System.out.println("getMonthlyInterestRate:"+account.getMonthlyInterestRate());
        System.out.println("getMonthlyInterest:"+account.getMonthlyInterest());
        System.out.println("oop1.account.withdraw:"+account.withdraw(2500));
        System.out.println("oop1.account.deposit:"+account.deposit(3000));
    }
}
