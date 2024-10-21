package w3.Person;

import java.util.Objects;

/**
 * Person
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    Person(int age, String firstName, String lastName) {
        if (age < 0) {
            this.age = 0;
            return;
        }
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "_";
            return;
        }
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "_";
            return;
        }
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: \n" + this.firstName + ' ' +
                this.lastName + ", Age: " + this.age + '.';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person p) {
            if (p.age == this.age && this.lastName.equals(p.lastName) &&
                    this.firstName.equals(p.firstName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
