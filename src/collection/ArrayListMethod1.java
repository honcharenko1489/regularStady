package collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<String> als = new ArrayList<>();
        als.add("Zaur");
        als.add("Ivan");
        als.add("Maria");
        als.add(1, "Mihailo");
        for (String s : als) {
            System.out.println(s + " ");
        }
        System.out.println();
       /*     for (int i =0; i< als.size(); i++){
                System.out.println(als.get(i));
            }*/
        // System.out.println(als.get(2));
        als.set(1, "Masha");
        als.remove(0);
        System.out.println(als);
    }
}

