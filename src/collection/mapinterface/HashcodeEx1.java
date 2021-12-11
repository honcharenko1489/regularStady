package collection.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student stt = new Student("Serhii", "Honcharenko", 5);
        Student stt1 = new Student("Zaur", "Treuglov", 5);
        Student stt2 = new Student("Ihor", "Mashonka", 5);

        map.put(stt, 5.0);
        map.put(stt1, 4.9);
        map.put(stt2, 3.1);
        System.out.println(map);
        System.out.println(map.containsKey(stt));
        System.out.println(stt.hashCode());
       // stt.course=3;
        System.out.println(map.containsKey(stt));
        System.out.println(stt.hashCode());

        /*Student stt3 = new Student("Serhii", "Honcharenko", 5);
        Student stt4 = new Student("Balda", "Moskal", 4      );
        boolean result = map.containsKey(stt3);
        System.out.println("result = "+result);
        System.out.println(stt.equals(stt3));
        System.out.println(stt.hashCode());
        System.out.println(stt3.hashCode());

        for (Map.Entry<Student, Double>  entry:map.entrySet()) {
            System.out.println(entry.getKey()  + " :"+entry.getValue());

        }

        Map<Integer, Student> smap = new HashMap<>(16, 0.75f);*/
    }
}
final class Student// implements Comparable<Student>
{
   final String name;
    final String surname;
    final int course;


 /*   @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }*/



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }



 /*   @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }*/
}
