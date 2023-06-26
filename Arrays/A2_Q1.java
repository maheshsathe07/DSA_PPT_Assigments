// Question 1
// Given an integer array nums of 2n integers, group these integers into n pairs
// (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is
// maximized. Return the maximized sum.
import java.util.*;
class A2_Q1 {
        static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = 0;
        for (int i = 0; i < len - 1; i += 2) {
            result += nums[i];
        }
        return result;
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
        System.out.println(arrayPairSum(nums));
    }
}