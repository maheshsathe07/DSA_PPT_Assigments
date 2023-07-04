package Assignment6;

import java.util.Scanner;

class Q3 {
    static boolean validMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int n=arr.length-1;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        while(j>0 && arr[j]<arr[j-1]){
            j--;
        }
        return (i>0 && i==j && j<n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(validMountainArray(arr));
    }
}