package collections.lambdaExpressions;
import java.util.Arrays;
import java.util.List;
public class SortInstagramPosts {
    public static void main(String[] args) {
        List<Integer> likes = Arrays.asList(200, 50, 900, 120);
//        likes.sort((a,b) -> b - a);
//        System.out.println(likes);
        likes.sort((a,b) -> a - b);
        System.out.println(likes);
    }
}
