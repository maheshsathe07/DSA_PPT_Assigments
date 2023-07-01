package Assignment5;

import java.util.Scanner;

public class Q7 {

    private static int findMinimumElement(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        if(a[start] <= a[end]) {
            return a[start];
        }
        while(start <= end) {
            int mid = (start + end) / 2;

            if(mid > 0 && a[mid] < a[mid-1]) {
                return a[mid];
            }

            if(mid < n-1 && a[mid] > a[mid+1]) {
                return a[mid+1];
            }

            if(a[start] <= a[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.printf("Minimum Element = %d%n", findMinimumElement(a));
    }
}