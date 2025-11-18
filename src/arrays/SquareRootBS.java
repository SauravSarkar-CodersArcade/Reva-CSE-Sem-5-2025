package arrays;
public class SquareRootBS {
    static int squareRoot(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s < e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }else if(square < n){
                ans = mid;
                s = mid+1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(37));
    }
}
