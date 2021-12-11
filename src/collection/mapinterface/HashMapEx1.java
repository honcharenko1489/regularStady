package collection.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> mis = new HashMap<>();
        mis.put(1000, "Koko Soso");
        mis.put(2001, "Popa Zopa");
        mis.put(3121, "Chak Noris");
        mis.put(4201, "Pisia Zopa");
        //mis.putIfAbsent(2001, "Andrretan Kolia");

        System.out.println(mis);
        //System.out.println(mis.get(1000));
       // mis.remove(4201);
        System.out.println(mis);
        System.out.println(mis.containsKey(2001));
        System.out.println(mis.keySet());
        System.out.println(mis.values());
    }
}
