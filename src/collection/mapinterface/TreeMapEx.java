package collection.mapinterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Student sstt = new Student("Serhii", "Honcharenko", 5);
        Student sstt1 = new Student("Zaur", "Treuglov", 3);
        Student sstt2 = new Student("Ihor", "Mashonka", 2);
        Student sstt3 = new Student("Se", "nko", 1);
        Student sstt4 = new Student("ar", "glov", 3);
        Student sstt5 = new Student("or", "on", 5);
        Student sstt6 = new Student("Tor", "Don", 4);

        treeMap.put(1.8, sstt);
        treeMap.put(2.4, sstt1);
        treeMap.put(3.1, sstt2);
        treeMap.put(3.2, sstt3);
        treeMap.put(3.4, sstt4);
        treeMap.put(4.4, sstt5);
        treeMap.put(4.5, sstt6);
        //treeMap.put(sstt7, 4.5);
        Student sstt7 = new Student("Tor", "Don", 4);
        System.out.println(treeMap.containsKey(sstt7));
       /* System.out.println(treeMap.get(6.2));
        treeMap.remove(6.4);
        System.out.println(treeMap);*/
        // System.out.println(treeMap.headMap(5.0));
      /*  System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());*/
    }
}
