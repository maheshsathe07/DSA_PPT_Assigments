package Assignment4;
import java.util.Arrays;
import java.util.Scanner;
class Q6 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of array in sorted order: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Q6 a = new Q6();
        System.out.println(Arrays.toString(a.sortedSquares(nums)));
    }

}