package exceptions;

import java.io.FileNotFoundException;

public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        try {
            i = 10;
            j = 10;
            k = i/j;
            int[] arr = {1,2,3};
            System.out.println(arr[1]);
            String name = "Reva";
            System.out.println(name.charAt(5));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index.");
            e.printStackTrace(); // Details of the exception
        }catch (StringIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Some logical mistake.");
        }catch (Exception e){
            System.out.println("Something unexpected happened!");
        }finally {
            System.out.println("This is mandatory.");
            System.out.println("All resources are released here.");
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Start of execution.");
    }
}
