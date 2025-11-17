package arrays;
import java.util.Arrays;
public class CopyArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] a1 = new int[arr.length];
        int[] a2 = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            a1[i] = arr[i];
        }
        System.out.println(Arrays.toString(a1));
        System.arraycopy(arr, 0, a2, 0, arr.length);
        System.out.println(Arrays.toString(a2));
    }
}
