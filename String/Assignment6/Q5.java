package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    static int productsum(int nums1[], int nums2[]){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum=0;
        int n = nums1.length-1;
        for(int i = 0; i<nums1.length; i++){
            sum += nums1[i] * nums2[n-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums1:");
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];
        System.out.println("Enter elements of nums1:");
        for(int i=0;i<n1;i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter size of nums2:");
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        System.out.println("Enter elements of nums2:");
        for(int i=0;i<n1;i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(productsum(nums1,nums2));
    }
}
