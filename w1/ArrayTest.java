import java.util.ArrayList;

public class ArrayTest {
    public static ArrayList<Number> createAndFillArrayList() {
        ArrayList<Number> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        return arr;
    }

    public static int countZeroes(ArrayList<Integer> arr) {
        int zeroes = 0;
        for (Integer i : arr) {
            if (i == 0) {
                zeroes++;
            }
        }
        return zeroes;
    }

    public static ArrayList<Integer> toInteger(ArrayList<Number> arr) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (Number number : arr) {
            ret.add(number.intValue());
        }
        return ret;
    }

    public static ArrayList<Double> toDouble(ArrayList<Number> arr) {
        ArrayList<Double> ret = new ArrayList<>();
        for (Number number : arr) {
            ret.add(number.doubleValue());
        }
        return ret;
    }

    public static void printReversedArrayListForEach(ArrayList<Integer> arr) {
        for (Integer integer : arr.reversed()) {
            System.out.println(integer);
        }
    }

    public static void printReversedArrayListFor(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }

    static int minimumValue(ArrayList<Integer> arr) {
        int min = arr.getFirst();
        for (Integer e : arr) {
            if (min > e) {
                min = e;
            }
        }
        return min;
    }

    static double average(ArrayList<Double> arr) {
        if (arr.isEmpty()) {
            return 0.;
        }
        double sum = 0;
        for (Double e : arr) {
            sum += e;
        }
        return sum / arr.size();
    }
}
