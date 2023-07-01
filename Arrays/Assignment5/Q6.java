package Assignment5;
import java.util.*;
class Q6 {
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1] < 0) ans.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1] = -1*nums[Math.abs(nums[i])-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicates(nums));
    }
}