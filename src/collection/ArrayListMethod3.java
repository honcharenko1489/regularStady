package collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> als1 = new ArrayList<>();
        als1.add("Zaur");
        als1.add("Ivan");
        als1.add("Ivan");
        als1.add("Maria");
        als1.add("Ivan");
        System.out.println(als1);
        ArrayList<String> als2 = new ArrayList<>();
      /*  als2.add("ZaZA");
        als2.add("Irvin");

        als1.addAll(1,  als2);
        System.out.println(als1);
        als1.clear();*/
    /*    als1.clear();
        System.out.println(als1.isEmpty());*/
        System.out.println(als1.contains("Tania"));
    }
}
