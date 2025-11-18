package collections;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        // We cannot create object of an Interface
        // Queue<Integer> queue = new Queue<>(); // Not Possible
        Queue<Integer> integers = new LinkedList<>();
        // add(), remove(), offer(), poll()
        integers.add(1); // Strict - Throws Exception
        integers.offer(2); // Lenient - Just Ignores
        integers.add(22);
        System.out.println(integers);
        System.out.println(integers.remove()); // Strict
        System.out.println(integers.poll()); // Lenient
    }
}
