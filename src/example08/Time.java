package example08;

class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    void setHour(int hour) {
        this.hour = hour;
    }

    void setMinute(int minute) {
        this.minute = minute;
    }

    void setSecond(int second) {
        this.second = second;
    }

    void setTime(int hour, int minute, int second) {
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }


    public String toString() {
        return hour + " " + minute + " " + second;
    }

    Time nextSecond() {
        second++;
        if (second==60) {
            second=0;
            minute++;
            if (minute==60) {
                minute=0;
                hour++;
                if (hour==24) {
                    hour=0;
                }
            }
        }
        return this;
    }

    Time previousSecond() {
        second--;
        if (second<0) {
            second=59;
            minute--;
            if (minute<0) {
                minute=59;
                hour--;
                if (hour<0) {
                    hour=23;
                }
            }
        }
        return this;
    }
}














