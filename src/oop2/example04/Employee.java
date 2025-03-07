package oop2.example04;

class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    Employee(int id,String firstName,String lastName,int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    int getID(){
        return id;
    }

    String getFirstName(){
        return  firstName;
    }

    String getLastName(){
        return  lastName;
    }

    String getName(){
        return  firstName+" "+lastName;
    }

    int getSalary(){
        return  salary;
    }

    void setSalary(int salary){
        this.salary= salary;
    }

    int getAnnualSalary(){
        return salary*12;
    }

    int raisSalary(int percent){
        return salary+=percent*salary/100;
    }
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
