package arrays;
import java.util.Arrays;
public class CountSort {
    static void countSort(int[] arr){
        // Step 1: Find the max
        int k = arr[0];
        for (int i=1; i< arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Create a count array - 0 to max(k)
        int[] count = new int[k+1];
        // Calculate the frequency of each element of the array
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative count (Start from 1 go till max(k))
        for(int i=1; i<=k; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        // Create the output array
        int[] output = new int[arr.length];
        // Start from the end of the array
        for(int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output back to the input
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
