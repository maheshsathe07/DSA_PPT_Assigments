package Assignment4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Q7 {
    static int maxCount(int m, int n, int[][] ops) {
        int minY = m;
        int minX = n;

        for (int[] op : ops) {
            minY = Math.min(minY, op[0]);
            minX = Math.min(minX, op[1]);
        }

        return minX * minY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m and n:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Enter rows and cols of operation 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("Enter operations:");
        int op[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                op[i][j] = sc.nextInt();
            }
        }

        System.out.println(maxCount(m,n,op));

    }
}
