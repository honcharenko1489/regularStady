package comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(8, "Gavrik", "Aleshkevich", 3000);
        Employee emp2 = new Employee(4, "Taras", "Pidaras", 1524);
        Employee emp3 = new Employee(2, "Tanya", "Shamanya", 300);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println("before sorting  \n"+employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("after sorting run\n"+employeeList);

    }
}
class Employee implements Comparable<Employee>{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name,  String surname, int salary){
    this.id=id;
    this.name=name;
    this.surname=surname;
    this.salary=salary;
    }
    public String toString(){
        return "Employee{"+
                "id="+id+
                ", name"+name+'\''+
                ", surname"+surname+'\''+
                ", salery"+salary+
                '}';
    }

    @Override
    public int compareTo(Employee enotherEmp) {
       if (this.id==enotherEmp.id){
            return 0;
        }else if (this.id<enotherEmp.id){
            return -1;
        }else {
            return -1;
        }/*
        //return this.id- enotherEmp.id;
        return this.id.compareTo(enotherEmp.id);
    }*/
}}
/*class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {


        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return -1;
        }
    }
}*/
    class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }
    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {

            return emp1.name.compareTo(emp2.name);
        }
}