package collection;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vs = new Vector<>();
        vs.add("Misha");
        vs.add("Katia");
        vs.add("Kolya");
        System.out.println(vs.lastElement());
        vs.remove(2);
        System.out.println(vs);
        System.out.println(vs.get(1));
    }
}
