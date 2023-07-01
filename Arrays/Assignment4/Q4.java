package Assignment4;
import java.util.*;
public class Q4 {
    static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int result=0;
        for(int i=0; i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(arrayPairSum(nums));
    }
}
