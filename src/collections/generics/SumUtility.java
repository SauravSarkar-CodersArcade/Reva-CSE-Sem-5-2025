package collections.generics;
import java.util.Arrays;
import java.util.List;
public class SumUtility {
    public static <T extends Number> double
    sum(List<T> list){
        double total = 0;
        for (T n : list) total += n.doubleValue();
        return total;
    }
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(80,90,100);
        List<Double> price = Arrays.asList(10.5, 12.5);
        System.out.println((int)sum(marks));
        System.out.println(sum(price));
    }
}
