import java.util.Scanner;
public class BakersPartitionMaxRegions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxRegions = ((n * (n+1))/2) + 1;
        System.out.println("Max Regions: " + maxRegions);
        int maxPieces = ((n * (n+1))/2) + 1;
        System.out.println("Max Pieces: " + maxPieces);
    }
}
