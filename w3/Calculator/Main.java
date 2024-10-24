package w3.Calculator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3, 4));
        System.out.println(Calculator.subtract(3, 4));
        System.out.println(Calculator.divide(3, 4));
        System.out.println(Calculator.multiply(3, 4));

        System.out.println(Calculator.divide(3, 0));
    }
}
