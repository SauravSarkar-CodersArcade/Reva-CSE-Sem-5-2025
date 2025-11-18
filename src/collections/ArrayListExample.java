package collections;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // Generic Array List
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("22");
        System.out.println(list);
        // Specific Array List - Fixed Data
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Reva");
        strings.add("CSE");
        System.out.println(strings.contains("Reva"));
    }
}
