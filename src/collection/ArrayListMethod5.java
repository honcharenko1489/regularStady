package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> als1 = new ArrayList<>();
        als1.add("Zaur");
        als1.add("Ivan");
        als1.add("Maria");
        als1.add("Kolya");
        als1.add("Katia");


        List<Integer> lil = List.of(3,  8, 13);
        System.out.println(lil);


        List<String> ili = List.copyOf(als1);
        System.out.println(ili);
        /*System.out.println(als1);
        Object[]  array = als1.toArray();
        System.out.println(array);
        String [] array2 = als1.toArray(new String[0]);
        for (String s:  array2) {
            System.out.println(s);*/
        }
/*
        List<String> ll = als1.subList(1, 4);
        System.out.println(ll);
        ll.add("Pasha");
        System.out.println(ll);
        System.out.println(als1);
        als1.add("Sveta");
        System.out.println(als1);
        System.out.println(ll);*/
/*//        System.out.println(als1);
        ArrayList<String> als2 = new ArrayList<>();

        als2.add("Maria");
        als2.add("Ivan");
      //  als2.add("Ihor");
//        als1.retainAll(als2);
//        System.out.println(als1);
        boolean res = als1.contains(als2);
        System.out.println(res);*/
    }

