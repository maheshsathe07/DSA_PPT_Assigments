// Question 7
// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

import java.util.Scanner;

class A2_Q7 {
        static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }
            else if(nums[i]>nums[i+1]){
                inc = false ;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(isMonotonic(nums));
    }
}
