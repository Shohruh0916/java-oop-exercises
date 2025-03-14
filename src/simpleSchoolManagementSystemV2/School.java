package simpleSchoolManagementSystemV2;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    private int teachersCount=0;
    private int studentsCount=0;

    School(){
        this.teachers=new Teacher[10];
        this.students=new Student[10];
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    double getTotalMoneyEarned(){
        double totalMonayEarned=0;
        for(int i=0; i<studentsCount; i++){
            totalMonayEarned+=students[i].getFeesPaid();
        }
        return totalMonayEarned;
    }

    double getToatalMoneySpent(){
        double totalMoneySpent=0;
        for(int i=0; i<teachersCount; i++){
            totalMoneySpent+=teachers[i].getSalaryEarned();
        }
        return  totalMoneySpent;
    }

    void addTeacher(Teacher teacher){
        teachers[teachersCount++]=teacher;
        teacher.setSchool(this);
    }

    void addStudent(Student student){
        students[studentsCount++]=student;
    }
}
