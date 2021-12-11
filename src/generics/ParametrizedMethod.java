package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer>  a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        int a= GenMethod.getSecondElement(a1);
        System.out.println(2);
        ArrayList<String>  a2 = new ArrayList<>();
        a2.add("hflls1");
        a2.add("hflls2");
        a2.add("hflls3");
        a2.add("hflls4");
        String d2= GenMethod.getSecondElement(a2);
        System.out.println(d2);
    }
}
class GenMethod{
    public static <T > T getSecondElement(ArrayList<T> arrayList){

        return arrayList.get(1);
    }
}
