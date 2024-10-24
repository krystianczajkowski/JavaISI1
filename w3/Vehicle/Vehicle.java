package w3.Vehicle;

import java.util.Calendar;
import java.util.Objects;

/**
 * Vehicle
 */
public class Vehicle {

    String brand;
    String model;
    int yearOfProduction;

    Vehicle(String brand, String model, int pDate) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "-";
        }
        if (model == null || model.isEmpty()) {
            this.model = "-";
        }
        if (pDate > (Calendar.YEAR)) {
            this.yearOfProduction = Calendar.YEAR;
        }
        this.model = model;
        this.brand = brand;
        this.yearOfProduction = pDate;
    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model +
                ", yearOfProduction: " + yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o instanceof Vehicle v) {
            return brand.equals(v.brand) && model.equals(v.model) && yearOfProduction == v.yearOfProduction;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, yearOfProduction);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("ford", "escort", 1990);
        Vehicle v2 = new Vehicle("ford", "escort", 1991);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.equals(v2));
    }
}
