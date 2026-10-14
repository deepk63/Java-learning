package homework.exercise9;

public class Clock {
    int hours;
    int minutes;

    void setTime(int h,int m) {
        hours = h;
        minutes = m;
    }

    void printTime() {
        System.out.println(hours + ":" + minutes);
    }
}
