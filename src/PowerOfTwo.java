import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n - 1)) == 0){
            System.out.println(n + " is Power of 2");
        }else{
            System.out.println(n + " is not Power of 2");
        }
    }
}
