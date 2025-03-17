package oop5.example02;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", "123 Main St");
        System.out.println(p1);
        p1.setAddress("456 Elm St");
        System.out.println("Updated address: " + p1.getAddress());
        Student s1 = new Student("Alice Brown", "789 Maple St", "Computer Science", 2, 5000.0);
        System.out.println(s1);
        s1.setProgram("Mathematics");
        s1.setYear(3);
        s1.setFee(5500.0);
        System.out.println("Updated student info: " + s1);
        Staff staff1 = new Staff("Bob Smith", "101 Oak St", "High School", 4000.0);
        System.out.println(staff1);
        staff1.setSchool("University");
        staff1.setPay(4500.0);
        System.out.println("Updated staff info: " + staff1);
    }
}

