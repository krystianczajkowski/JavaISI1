package w2.Time;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Time t = new Time(23, 59);
        Time t1 = new Time(0, 1);
        System.out.println(t);
        System.out.println(t1);
        Time t2 = t.addTime(t1);
        System.out.println(t2);
    }
}
