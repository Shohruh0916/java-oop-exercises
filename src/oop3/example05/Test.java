package oop3.example05;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "John Doe", 'm');
        Account account1 = new Account(1001, customer1, 500.00);
        System.out.println(account1);
        account1.deposit(150.75);
        System.out.println("After deposit: " + account1);
        account1.withdraw(200);
        System.out.println("After withdrawal: " + account1);
        account1.withdraw(600);
        System.out.println("After over-withdrawal attempt: " + account1);
    }
}
