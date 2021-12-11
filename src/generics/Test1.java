package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("bye");
        list.add("may may");
        for (String s:list){
            System.out.println(s+" length "+ s.length());

        }
      /*  list.add("Tom");
        list.add(2);
        list.add(new StringBuilder("podfjp"));
        list.add(new Car());*/

    }
}
