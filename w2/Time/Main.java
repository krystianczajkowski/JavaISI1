package w2.Time;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Time t = new Time(23, 59);
        System.out.println(t);
        t.addTime(0, 1);
        System.out.println(t);
        t.addTime(24, 59);
        System.out.println(t);
    }
}
