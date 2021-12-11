package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList als = new ArrayList();
        als.add("Zaur");
        als.add("Ivan");
        als.add("Maria");
        als.add(7);
        System.out.println(als);

        ArrayList<String> als1 = new ArrayList<>(200);
        als1.add("Petro");
        als1.add("Adam");
        List<String> als3 = new ArrayList<>();

        ArrayList<String> als4 = new ArrayList<>(als);
        System.out.println(als4);
        System.out.println(als==als4);
    }
}
