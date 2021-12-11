package collection;

public class StackEx {
    static void abc1(){
        System.out.println("abs1 start");
        System.out.println("abc1 and");
    }
    static void abc2(){
        System.out.println("abs2 start");
        abc1();
        System.out.println("abc2 and");
    }
    static void abc3(){
        System.out.println("abs3 start");
        abc2();
        System.out.println("abc3 and");
    }

    public static void main(String[] args) {
        System.out.println("Main  start");
        abc3();
        System.out.println("mains and");
    }
}
