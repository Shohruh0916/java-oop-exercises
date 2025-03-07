package oop2.example04;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee(8,"Pater","Tan",2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println(e1.getID());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.raisSalary(10));
        System.out.println(e1);
    }
}
