// Question 3
// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1. Given an integer array nums, return the length of its
// longest harmonious subsequence among all its possible subsequences.A subsequence of an array
// is a sequence that can be derived from the array by deleting some or no elements without 
// changing the order of the remaining elements.

import java.util.Arrays;
import java.util.Scanner;

public class A2_Q3 {
    static int findLHS(int[] nums) {
        int len = nums.length;
        int left = 0;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            while (left < i && nums[i] - nums[left] > 1L) {
                left++;
            }
            if (nums[i] - nums[left] == 1L) {
                result = Math.max(i - left + 1, result);
            }
        }
        return result;
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
        System.out.println(findLHS(nums));
    }
}
