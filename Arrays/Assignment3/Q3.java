package Assignment3;

import java.io.*;
import java.util.Scanner;

class Q3{

    static void nextPermutation(int[] arr)
    {
        int n = arr.length, i, j;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        if (i < 0) {
            reverse(arr, 0, arr.length - 1);
        }
        else {
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }
            swap(arr, i, j);
            reverse(arr, i + 1, arr.length - 1);
        }
    }

    static void reverse(int[] arr, int start, int end)
    {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
