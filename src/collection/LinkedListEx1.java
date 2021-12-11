package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 ss1 = new Student2("Ivan", 2);
        Student2 ss2 = new Student2("Mykola",2);
        Student2 ss3 = new Student2("Maria",3);
        Student2 ss4 = new Student2("Petro",1);
        Student2 ss5 = new Student2("Loh",4);
        LinkedList<Student2>  ssl = new LinkedList<>();
        ssl.add(ss1);
        ssl.add(ss2);
        ssl.add(ss3);
        ssl.add(ss4);
        ssl.add(ss5);
        System.out.println("Linked List = " + ssl);
        System.out.println(ssl.get(2));
        Student2 ss6 = new Student2("Lola",1);
        Student2 ss7 = new Student2("Anya",5);
        ssl.add(ss6);
        ssl.add(1, ss7);
        System.out.println(ssl);
        ssl.remove(4);
        System.out.println(ssl);
    }
}
class Student2{
   String name;
   int  course;

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }
}