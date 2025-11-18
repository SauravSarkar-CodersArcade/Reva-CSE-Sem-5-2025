package collections;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(22);
        list.add(1);
        list.add(2);
        list.add(21);
        list.add(44);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
