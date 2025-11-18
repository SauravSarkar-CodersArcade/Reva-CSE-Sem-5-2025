package collections;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        System.out.println(integers); // LIFO Order
        System.out.println(integers.peek());
    }
}
