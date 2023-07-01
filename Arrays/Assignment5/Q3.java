package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Q3{
    static int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of nums:");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
