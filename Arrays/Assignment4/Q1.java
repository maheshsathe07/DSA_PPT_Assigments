package Assignment4;

import java.io.*;
import java.util.Scanner;

class Q1 {
    void findCommon(int ar1[], int ar2[], int ar3[])
    {
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length
                && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if (ar1[i] < ar2[j])
                i++;
            else if (ar2[j] < ar3[k])
                j++;
            else
                k++;
        }
    }
    public static void main(String args[])
    {
        Q1 ob = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1:");
        int n1 = sc.nextInt();
        int[] ar1 = new int[n1];
        for(int i=0;i<n1;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter size of array2:");
        int n2 = sc.nextInt();
        int[] ar2 = new int[n2];
        for(int i=0;i<n1;i++){
            ar2[i]=sc.nextInt();
        }
        System.out.println("Enter size of array3:");
        int n3 = sc.nextInt();
        int[] ar3 = new int[n3];
        for(int i=0;i<n1;i++){
            ar3[i]=sc.nextInt();
        }
        System.out.print("Common elements are ");
        ob.findCommon(ar1, ar2, ar3);
    }
}