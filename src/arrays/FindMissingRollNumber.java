package arrays;
public class FindMissingRollNumber {
    public static void main(String[] args) {
        int[] rolls = {101, 102, 104, 105};
        int n = 5;
        int expectedSum = (n * (2 * 101 + (n - 1))) / 2;
        int actualSum = 0;
        for (int r : rolls) actualSum += r;
        System.out.println("Missing roll number: = " +
                (expectedSum - actualSum));
    }
}
