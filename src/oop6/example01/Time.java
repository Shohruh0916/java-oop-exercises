package oop6.example01;

public class Time {
    double hour;
    double minute;
    double second;

    public Time() {
        setTime(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(double hour, double minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public double getHour() {
        return hour;
    }

    public double getMinute() {
        return minute;
    }

    public double getSecond() {
        return second;
    }

    void setTime(long elapseTime){
        long totalSecond=elapseTime/1000;
        second=(int) totalSecond%60;
        long totalMinutes=totalSecond/60;
        minute=(int)(totalMinutes%60);
        long totalHours=totalMinutes/60;
        hour=(int)(totalHours%24);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
