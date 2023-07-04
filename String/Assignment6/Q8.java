package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

class Q8 {
    static int[][] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < C.length; i++) {
            for (int k = 0; k < A[0].length; k++) {
                if (A[i][k] != 0) {
                    for (int j = 0; j < C[0].length; j++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols for Matrix A:");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] A = new int[m1][n1];
        System.out.println("Enter elements of matrix A:");
        for(int i=0; i<m1;i++){
            for(int j=0; j<n1;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rows and cols for Matrix B:");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] B = new int[m2][n2];
        System.out.println("Enter elements of matrix B:");
        for(int i=0; i<m1;i++){
            for(int j=0; j<n1;j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(multiply(A,B)));
    }
}