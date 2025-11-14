class Solution {
    static int solve(int n, int k){
        if(n == 1){
            return 0;
        }
        return (solve(n-1,k) + k)%n;
    }
    public static int findTheWinner(int n, int k) {
        return solve(n,k) + 1;
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(6,2));
    }
}