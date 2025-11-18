package collections.streams;
import java.util.Arrays;
import java.util.List;
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        int product = numbers.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println(sum);
        System.out.println(product);
    }
}
