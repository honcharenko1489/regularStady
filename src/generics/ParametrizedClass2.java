package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Tolic", 33);
        System.out.println("First value = "+ pair.getFirstValue()+", "+" Second  value = "+pair.getSecondValue() );
        Pair<Double, Integer> pair1 = new Pair<>(1.3, 332);
        System.out.println("First value = "+ pair1.getFirstValue()+", "+" Second  value = "+pair1.getSecondValue() );
        OtherPair<Integer> op = new OtherPair<>(22,4);
        String d = op.toString();
        System.out.println(d);
    }
}
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
   /* public V1 getFirstValue(V1 value1){
        return  value1;
    }*/
    public V2 getSecondValue(){
        return value2;
    }

    public V1 getFirstValue() {
        return value1;
    }
}
class OtherPair<V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    /* public V1 getFirstValue(V1 value1){
         return  value1;
     }*/
    public V getSecondValue(){
        return value2;
    }

    public V getFirstValue() {
        return value1;
    }
}
