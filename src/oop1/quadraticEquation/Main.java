package oop1.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter c:");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("getroot1:"+quadraticEquation.getRoot1());
            System.out.println("getroot2:"+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("getroot:"+quadraticEquation.getroot());
        }else{
            System.out.println("The equation has no roots😕");
        }
    }
}
