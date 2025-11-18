package collections;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    static void generateBinary(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String current = q.poll();
            System.out.print(current + " ");
            q.offer(current + "0");
            q.offer(current + "1");
        }
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);
    }
}
