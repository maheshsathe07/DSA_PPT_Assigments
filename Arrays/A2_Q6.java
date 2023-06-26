// Question 6
// Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise,
// return -1.

// You must write an algorithm with O(log n) runtime complexity.

import java.util.Scanner;

public class A2_Q6 {
    static int FindIndexOfTarget(int[] nums, int target){
        int n = nums.length;
        int mid = 0;
        int start=0;
        int end = n;
        if(nums[n/2]==nums[mid]){
            return mid;
        }
        else if(nums[n/2]>nums[mid]){
            start=mid+1;
        }
        else{
            end = mid-1;
        }
        for(int i = start; i<end;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;   
     }
     public static void main(String[] args) {
         int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:P");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target;
        System.out.println("Enter target");
        target = sc.nextInt();
        System.out.println(FindIndexOfTarget(nums,target));
     }
}
