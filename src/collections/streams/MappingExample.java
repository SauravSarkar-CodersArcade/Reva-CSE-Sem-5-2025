package collections.streams;
import java.util.Arrays;
import java.util.List;
public class MappingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
