package simpleSchoolManagementSystem;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    private int teachersCount=0;
    private int studentsCount=0;

    School(){
        this.teachers=new Teacher[100];
        this.students=new Student[100];
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
        return  0;
    }



    void addTeacher(Teacher teacher){
        teachers[teachersCount++]=teacher;
        teacher.setSchool(this);
    }

    void addStudent(Student student){
        students[studentsCount++]=student;
    }
}
