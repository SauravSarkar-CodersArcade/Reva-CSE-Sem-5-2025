package collections;
import java.util.ArrayList;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(21);
        list.add(13);
        list.add(15);
        list.add(2);
        list.add(4);
        list.add(18);
        System.out.println("Before: " + list);
        // Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if(i < 10){
//                it.remove();
//            }
//        }
        list.removeIf(i -> i < 10); // Java 8 - 1.8
        System.out.println("After: " + list);
    }
}
