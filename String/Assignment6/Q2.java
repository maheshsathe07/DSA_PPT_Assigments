package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = row * col - 1;

        while(l <=r ){
            int mid = l + (r-l)/2;
            int val = matrix[mid/col][mid%col];
            if(val == target) return true;
            if(val > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols of matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println(searchMatrix(matrix,target));
    }
}