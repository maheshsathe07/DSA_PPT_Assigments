import java.util.*;
import java.io.*;

class Q5_MergeToSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = new int[m+n];
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[j];
            j+=1;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums1: ");
        p = sc.nextInt();
        int[] nums1 = new int[p];
        System.out.println("Enter elements of nums1: ");
        for(int i =0; i<p; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter value of m: ");
        int m = sc.nextInt();

        int n;
        System.out.println("Enter size of nums2: ");
        n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of nums2: ");
        for(int i =0; i<n; i++){
            nums2[i] = sc.nextInt();
        }

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}

