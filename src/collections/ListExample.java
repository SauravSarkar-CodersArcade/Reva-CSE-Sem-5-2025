package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        List<Integer> integers = new ArrayList<>();
        strings.add("Reva");
        integers.add(1);
        System.out.println(strings);
        System.out.println(integers);
    }
}
