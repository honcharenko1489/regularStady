package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
    /*    Info<String> info1 = new Info<>("Hei");
        System.out.println(info1);
        String s = info1.getValue()*/;
        Info<Integer> info2 = new Info<>(14);
        System.out.println(info2);
        Integer ii = info2.getValue();
        Info<Double> info3 = new Info<>(3.14);
        System.out.println(info3);
        //Integer ii = info2.getValue();
    }
/*    public void abc(Info<String> info){
    String s = info.getValue();
    }
    public void abc(Info<Integer> info){
        Integer in = info.getValue();
    }*/
}
class Info<T>{
    private T value;
    public Info(T value){
        this.value=value;
    }
    public String toString(){
        return "{["+value+"]}";
    }

    public T getValue() {
        return value;
    }
}
class Bus{

}
/*
class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
*/
/*class Child  extends Parent{
    public void abc(Info<Integer> info){
       Integer in = info.getValue();
    }*//*

}*/
