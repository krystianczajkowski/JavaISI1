import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // whatTheDogDoin();
        ArrayList<Number> arr = ArrayTest.createAndFillArrayList();
        System.out.println(ArrayTest.average(ArrayTest.toDouble(arr)));
        System.out.println(ArrayTest.countZeroes(ArrayTest.toInteger(arr)));
    }

    public static void whatTheDogDoin() {
        Dog d1 = new Dog("Kleks", "big dog", 6);
        d1.bark();
        System.out.println(d1);
    }
}
