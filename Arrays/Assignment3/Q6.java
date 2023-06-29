package Assignment3;
import java.util.*;
public class Q6 {
        static int singleNumber(int[] nums) {
            int res = 0;
            for (int x : nums) {
                res ^= x;
            }
            return res;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entee size of nums: ");
            int n = sc.nextInt();
            int nums[] = new int[n];
            System.out.println("Enter elements of array:");
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println(singleNumber(nums));
        }

}

