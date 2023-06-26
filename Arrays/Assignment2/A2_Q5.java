// Question 5
// Given an integer array nums, find three numbers whose product is
// maximum and return the maximum product.

import java.util.Scanner;

class A2_Q5{
static int maximumProduct(int[] nums) {
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE;
    for (int i = 0;i < nums.length; i++) {
        if (nums[i] <= min1) {
            min2 = min1;
            min1 = nums[i];
        } else if (nums[i] <= min2) {     // n lies between min1 and min2
            min2 = nums[i];
        }
        if (nums[i] >= max1) {            // n is greater than max1, max2 and max3
            max3 = max2;
            max2 = max1;
            max1 = nums[i];
        } else if (nums[i] >= max2) {     // n lies betweeen max1 and max2
            max3 = max2;
            max2 = nums[i];
        } else if (nums[i] >= max3) {     // n lies betwen max2 and max3
            max3 = nums[i];
        }
    }
    return Math.max(min1 * min2 * max1, max1 * max2 * max3);
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
        System.out.println(maximumProduct(nums));
    }
}
