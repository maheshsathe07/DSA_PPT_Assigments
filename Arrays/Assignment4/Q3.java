package Assignment4;
import java.util.*;
public class Q3 {
    static void transpose(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        int res[][] = new int[c][r];
        {
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    int temp = mat[i][j];
                    res[i][j] = mat[j][i];
                    res[j][i] = temp;
                }
            }
        }
        for(int i=0; i<c;i++){
            for(int j=0; j<r;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no. of cols:");
        int cols = sc.nextInt();
        System.out.println("Enter matrix:");
        int mat[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        transpose(mat);

    }
}
