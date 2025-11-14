package methods;
public class HappyNumber {
    static int sumOfSquares(int n){
        int rem, sum = 0;
        while (n != 0){
            rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
    static boolean isHappy(int n){
        int result = n;
        while (result != 1 && result != 4){
            result = sumOfSquares(result);
        }
        if(result == 1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n1 = 19, n2 = 20;
        if(isHappy(n1)){
            System.out.println(n1 + " is happy.");
        }else{
            System.out.println(n1 + " is unhappy.");
        }
        if(isHappy(n2)){
            System.out.println(n2 + " is happy.");
        }else{
            System.out.println(n2 + " is unhappy.");
        }
    }
}
