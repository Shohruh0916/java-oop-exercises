package oop4.example05;

import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;

    String [] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String [] days={"Sunday","Monday","Tuesdday","Wednesday","Thursday","Friday","Saturday"};
    int [] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};

    boolean isLeapYear(int year){
        return year%4==0 && year%400==0 && year%100!=0;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void setDate(int year,int month ,int day){

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    MyDate nextDay(){
        day++;
        int maxDays=daysInMonths[month-1];
       if(month==2 && isLeapYear(year)){
           maxDays=29;
       }
       if(day>maxDays){
           day=1;
           nextMonth();
       }
       return this;
    }

    MyDate nextMonth(){
        month++;
        if(month>12){
            month=1;
            nextYear();
        }
        int maxDays=daysInMonths[month-1];
        if(month==2 && isLeapYear(year)){
            maxDays=29;
        }
        if(day>maxDays){
            day=maxDays;
        }
        return this;
    }

    MyDate nextYear(){
        year++;
        if(month==2 && day==29 && !isLeapYear(year)){
            day=28;
        }
        return this;
    }

    MyDate previousDay(){
        day--;
        if(day<1){
            previousMonth();
        }
        day=daysInMonths[month-1];
        if (month==2 && isLeapYear(year)) {
            day=29;
        }
        return this;
    }

    MyDate previousMonth(){
        month--;
        if (month<1) {
            month=12;
            previousYear();
        }
        int maxDays=daysInMonths[month-1];
        if(day>maxDays){
            day=maxDays;
        }
        return this;
    }

    MyDate previousYear(){
        year--;
        if (month==2 && day==29 && !isLeapYear(year)) {
            day=28;
        }
        return  this;
    }
}
