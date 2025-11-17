package strings.bufferBuilder;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a,b) ? "Anagram" : "Not Anagram");
    }

}
