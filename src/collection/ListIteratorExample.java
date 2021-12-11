package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s= "madm";
        List<Character> lis = new LinkedList<>();
        for (char  ch: s.toCharArray()) {
            lis.add(ch);
        }
        ListIterator<Character> it=lis.listIterator();
        ListIterator<Character> reversIt=lis.listIterator(lis.size());
        boolean palindrom = true;
        while (it.hasNext()  && reversIt.hasPrevious()){
            if (it.next()!=reversIt.previous()){
                palindrom=false;
            }
        }
        if (palindrom){
            System.out.println("palindrom");
        }else {
            System.out.println("NOT palindrom");
        }
    }
}
