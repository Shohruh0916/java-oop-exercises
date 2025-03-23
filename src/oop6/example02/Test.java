package oop6.example02;

public class Test {
    public static void main(String[] args) {
        BMI person1 = new BMI("John", 25, 70, 5, 9);

        BMI person2 = new BMI("Alice", 30, 65, 1.7);

        BMI person3 = new BMI("Bob", 20, 45, 5, 6);

        BMI person4 = new BMI("Charlie", 40, 85, 5, 8);

        BMI person5 = new BMI("David", 50, 110, 5, 5);

        person1.printBMIInfo();
        person2.printBMIInfo();
        person3.printBMIInfo();
        person4.printBMIInfo();
        person5.printBMIInfo();
    }
}
