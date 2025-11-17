package arrays;
public class JaggedArray {
    public static void main(String[] args) {
        // C++ -> int * arr = new int[5];
        int[] arr = new int[5];
        // 2D Array = Array of arrays?
        int[][] jagged = {{1,2,3,4,5,6,7},
                          {4,5,6,7},
                          {7,8,9}};
        for (int i=0; i< jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }// Array of arrays?
            System.out.println();
        }
        for (int[] x : jagged){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
