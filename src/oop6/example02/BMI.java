package oop6.example02;

public class BMI {
    String name;
    int age;
    double weight;
    double height;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = convertToMeters(feet, inches);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private double convertToMeters(double feet,double inches){
        return ((feet*12)+inches)*0.0254;
    }

    public double getBMI(){
        return weight/(height*height);
    }

    public void printBMIInfo() {
        System.out.printf("Name: %s, Age: %d, BMI: %.2f, Status: %s%n",
                name, age, getBMI(), toString());
    }

    public String toString() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
