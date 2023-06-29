package Assignment3;
import java.util.*;
import java.io.*;
class Q5{
    static int[] plusone(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            ++arr[i];
            arr[i]%=10;
            if(arr[i]!=0){
                return arr;
            }
        }
        arr = new int[n+1];
        arr[0]+=1;
        return arr;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(plusone(arr)));
    }
}