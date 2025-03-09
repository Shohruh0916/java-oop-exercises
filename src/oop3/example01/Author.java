package oop3.example01;

class Author {
    String  name;
    String email;
    char gender;

    Author(String  name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email){
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name+" "+email+" "+gender;
    }
}
