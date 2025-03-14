package simpleSchoolManagementSystem.version1;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private School school;
    private double salaryEarned=0.0;

    Teacher(int id,String firstName, String lastName, double salary,School school){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.school=school;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public School getSchool() {
        return school;
    }

    public double getSalaryEarned() {
        return salaryEarned;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void receiveEarned(){

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", school=" + school +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
