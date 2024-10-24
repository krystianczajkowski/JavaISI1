package w3.Results;

import java.util.Arrays;
import java.util.Objects;

/**
 * Results
 */
public class Results {
    String firstName;
    String lastName;
    int[] results;

    Results(String fName, String lName, int arraySize) {
        if (fName.isEmpty() || fName == null) {
            this.firstName = "-";
            return;
        }
        if (lName.isEmpty() || lName == null) {
            this.lastName = "-";
            return;
        }
        this.firstName = fName;
        this.lastName = lName;
        this.results = new int[arraySize];

    }

    public void addResult(int index, int result) {
        this.results[index] = result;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double averageResult() {
        int sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        return (double) sum / results.length;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean sameResult(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Results for " + firstName + ' ' + lastName + ": Average Score = " +
                averageResult() + ", Results: " + Arrays.toString(results) + '.';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Results o) {
            if (firstName == o.firstName && lastName == o.lastName && sameResult(results, o.results)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, results);
    }

    public static void main(String[] args) {
        Results r = new Results("M", "L", 3);
        r.addResult(0, 1);
        r.addResult(1, 1);
        r.addResult(2, 1);
        System.out.println(r);
        Results nr = new Results("M", "L", 3);
        nr.addResult(0, 1);
        nr.addResult(1, 1);
        nr.addResult(2, 3);
        System.out.println(nr);
        System.out.println(r.equals(nr));

    }
}
