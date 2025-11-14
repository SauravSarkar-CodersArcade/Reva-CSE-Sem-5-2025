package loopingStatements;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,3,2,1};
        int res = 0;
        for (int i=0; i< arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println("The non repeating element in the array is: "
        + res);
    }
}
