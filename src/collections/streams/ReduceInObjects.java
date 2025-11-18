package collections.streams;
import java.util.Arrays;
import java.util.List;
// Integer -> (s) -> (name, amount)
class Students {
    String name;
    int amount;
    public Students(String n, int a){
        name = n;  amount = a;
    }
}
public class ReduceInObjects {
    public static void main(String[] args) {
        List<Students> students = Arrays.asList(
                new Students("Akarsh", 1200),
                new Students("Chaithanya", 1400),
                new Students("Spandana", 1500)
        );
        int totalAmount = students.stream().map(s -> s.amount)
                .reduce(0, (a,b) -> (a + b));
        System.out.println(totalAmount);
    }

}
