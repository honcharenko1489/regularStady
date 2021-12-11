package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> als1 = new ArrayList<>();
        als1.add("Zaur");
        als1.add("Ivan");
        als1.add("Maria");
        als1.add("Kolya");
        als1.add("Katia");

        Iterator<String> si = als1.iterator();
        while (si.hasNext()){

            si.next();
            si.remove();
        }
        System.out.println(als1);
    }
}
