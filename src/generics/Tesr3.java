package generics;

import java.util.ArrayList;
import java.util.List;

public class Tesr3 {
    public static void main(String[] args) {
        List<?> li  = new ArrayList<Integer>();


        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(5.12);
        doubleList.add(8.74);
        showListInfo(doubleList);
        List<String> stList = new ArrayList<>();
        stList.add("ku");
        stList.add("Nu");
        stList.add("nya");
        showListInfo(stList);

        ArrayList<Double>   arDo = new ArrayList<>();
        arDo.add(71.56);
        arDo.add(1.1);
        arDo.add(98.111);
        System.out.println(sum(arDo));
     /*   ArrayList<Integer>  arDo1 = new ArrayList<>();
        arDo.add(71);
        arDo.add(1);
        arDo.add(98);
        System.out.println(sum(arDo1));*/
    }
    static void showListInfo(List<?> list){
        System.out.println("My list have : " +list);
    }

    public static double sum(ArrayList<? extends Number> al){
        double  sum= 0;
        for (Number  n: al){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
