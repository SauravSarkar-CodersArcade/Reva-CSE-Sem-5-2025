package collections.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // Way 1
        Stream<Integer> stream = numbers.stream();
        // Way 2
        int[] arr = {1,2,3,4,5};
        IntStream stream1 = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
}
