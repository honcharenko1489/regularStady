package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
    Student s1 = new Student("Kamila", 'f', 41, 2, 5.0);
    Student s2 = new Student("Nikolas", 'm', 25, 4, 4.5);
    Student s3 = new Student("Tatiana", 'f', 24, 3, 4.3);
    Student s4 = new Student("Stephan", 'm', 18, 1, 4.8);
    Student s5 = new Student("Konrad", 'm', 18, 2, 3.4);
    ArrayList<Student> as = new ArrayList<>();
    as.add(s1);
    as.add(s2);
    as.add(s3);
    as.add(s4);
    as.add(s5);
        System.out.println(as);
        Student s6 = new Student("Konrad", 'm', 18, 2, 3.4);
        int index = as.indexOf(s6);
        //Student s6 = new Student("Maria", 'f', 25, 5, 5.0);
       // as.remove(s6);
        System.out.println(index);
    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}
