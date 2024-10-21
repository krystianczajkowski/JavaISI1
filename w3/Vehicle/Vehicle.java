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

    Vehicle(String brand, String Model, int pDate) {
        if (brand.isEmpty() || brand == null) {
            this.brand = "-";
        }
        if (model.isEmpty() || model == null) {
            this.model = "-";
        }
        if (pDate > (Calendar.YEAR)) {
            this.yearOfProduction = Calendar.YEAR;
        }
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
            return this.brand.equals(v.brand) && this.model.equals(v.model)
                    && this.yearOfProduction == v.yearOfProduction;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.model, this.brand, this.yearOfProduction);
    }

}
