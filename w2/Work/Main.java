package w2.Work;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee[] emp = new Employee[1];
        emp[0] = e;
        int[] sal = { 1 };
        Company c = new Company(emp, sal);
        for (Employee em : c.employees) {
            System.out.println(em.salary);
        }

    }
}
