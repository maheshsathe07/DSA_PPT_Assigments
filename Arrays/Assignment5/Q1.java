package Assignment5;
import java.util.Arrays;
import java.util.Scanner;
public class Q1 {
    static int[][] convert1Darray(int[] nums, int m, int n){
        if(nums.length!=m*n){
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        for(int i=0; i<nums.length; i++){
            res[i/n][i%n] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1D array:");
        int len = sc.nextInt();
        System.out.println("Enter elements of array:");
        int nums[] = new int[len];
        for(int i=0; i<len; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter values for rows and cols of 2D array:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Arrays.deepToString(convert1Darray(nums,m,n)));
    }
}
