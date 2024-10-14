package w2.Time;

/**
 * Time
 */
public class Time {

    int hours;
    int minutes;

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;

        while (this.minutes > 59) {
            this.minutes -= 60;
            this.hours++;
        }
        if (this.hours > 23) {
            this.hours = this.hours % 24;
        }
    }

    public Time addTime(Time t) {
        return new Time(t.hours + this.hours, t.minutes + this.minutes);
    }

    public String toString() {
        return "The time is: " + this.hours + " " + this.minutes;
    }
}
