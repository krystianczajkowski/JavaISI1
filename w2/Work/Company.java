package w2.Work;

/**
 * Company
 */
public class Company {
    Employee[] employees;

    Company(Employee[] employees, int[] salaries) {
        this.employees = employees;
        int i = 0;
        for (Employee e : this.employees) {
            e.salary = salaries[i++];
        }
    }
}
