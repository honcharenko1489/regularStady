package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(-3);
        ali.add(8);
        ali.add(12);
        ali.add(-8);
        ali.add(0);
        ali.add(5);
        ali.add(10);
        ali.add(1);
        ali.add(150);
        ali.add(-30);
        ali.add(19);
        Collections.sort(ali);
        System.out.println(ali);
        Collections.reverse(ali);
        System.out.println(ali);
        Collections.shuffle(ali);
        System.out.println(ali);
        Vector vector = new Vector();

        /* int index = Collections.binarySearch(ali, 12);
        System.out.println(index);*/
   /*     int[] arr = {-3, 8, 12, -8, 0, 5, 10,  1, 150, -30, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,150);
        System.out.println(index);*/

        /*Employee emp1 = new Employee(8, "Gavrik", "Aleshkevich", 3000);
        Employee emp2 = new Employee(4, "Taras", "Pidaras", 1524);
        Employee emp3 = new Employee(2, "Tanya", "Shamanya", 300);
        Employee emp4 = new Employee(14, "Gavron", "Aleshk", 3000);
        Employee emp5 = new Employee(5, "Edaras", "Pi", 152344);
        Employee emp6 = new Employee(25, "Tatyana", "Sha", 3040);
        Employee emp7 = new Employee(5, "Yana", "Pisha", 30);
        ArrayList<Employee> el = new ArrayList<>();
        el.add(emp1);
        el.add(emp2);
        el.add(emp3);
        el.add(emp4);
        el.add(emp5);
        el.add(emp6);
        el.add(emp7);
        Collections.sort(el);
        System.out.println(el);
        int index2 = Collections.binarySearch(el, new Employee(25, "Tatyana", "Sha", 3040));
        System.out.println(index2);*/
    }
}
class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "id= " + id +
                ", name  " + name + '\'' +
                ", surname " + surname + '\'' +
                ", salery  " + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
