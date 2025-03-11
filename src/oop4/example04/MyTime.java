package oop4.example04;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    MyTime() {
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    void setTime(int hour, int minute, int second) {
        if ((hour>=0 && hour<=23) && (minute>=0 && minute<=59) && (second>=0 && second<=59)) {
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        } else {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<=23) {
            this.hour=hour;
        } else {
            System.out.println("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (minute>=0 && minute<=59) {
            this.minute=minute;
        } else {
            System.out.println("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (second>=0 && second <=59) {
            this.second=second;
        } else {
            System.out.println("Invalid second!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    MyTime nextSecond() {
        second++;
        if (second==60) {
            second=0;
            nextMinute();
        }
        return this;
    }

    MyTime nextMinute() {
        minute++;
        if (minute==60) {
            minute=0;
            nextHour();
        }
        return this;
    }

    MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    MyTime previousSecond() {
        if (second==0) {
            second=59;
            previousMinute();
        } else {
            second--;
        }
        return this;
    }

    MyTime previousMinute() {
        if (minute==0) {
            minute=59;
            previousHour();
        } else {
            minute--;
        }
        return this;
    }

    MyTime previousHour() {
        hour = (hour==0) ? 23 : hour - 1;
        return this;
    }
}
