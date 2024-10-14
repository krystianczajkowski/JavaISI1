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
    }

    public void addTime(int hours, int minutes) {
        if ((this.minutes + minutes) > 59) {
            this.hours++;
            if (this.hours > 23) {
                this.hours = this.hours % 24;
            }
            this.minutes = (this.minutes + minutes) % 60;
        } else {
            this.hours = this.hours + hours;
            if (this.hours > 23) {
                this.hours = this.hours % 24;
            }
            this.minutes = this.minutes + minutes;
        }
    }

    public String toString() {
        return "The time is: " + this.hours + " " + this.minutes;
    }
}
