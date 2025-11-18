package collections;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        String[] names = {"Akarsh", "Spandana", "Sharanya",
        "Ankit", "Mrinmoy", "Vijay", "Spandana", "Sharanya",
                "Ankit", "Mrinmoy"};
        Set<String> uniqueNames = new LinkedHashSet<>();
        uniqueNames.addAll(Arrays.asList(names));
        System.out.println("After removing duplicates: "
        + uniqueNames);
        // :: "Stream API" - Java 8
        uniqueNames.forEach(System.out::println);
    }
}
