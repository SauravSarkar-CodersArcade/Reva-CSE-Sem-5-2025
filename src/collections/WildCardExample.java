package collections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class WildCardExample {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        printList(integers);
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("Ruby");
        printList(strings);
    }
}
