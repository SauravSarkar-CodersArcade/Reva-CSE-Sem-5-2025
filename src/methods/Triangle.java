package methods;
public class Triangle {
    void printTriangle(int n){
        for(int i=1; i<=n; i++){
            // Print the spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Print the stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            // Move to the next line or row
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Triangle obj = new Triangle();
//        obj.printTriangle(5);
          new Triangle().printTriangle(6);



    }
}
