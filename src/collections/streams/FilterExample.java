package collections.streams;
import java.util.Arrays;
import java.util.List;
public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
