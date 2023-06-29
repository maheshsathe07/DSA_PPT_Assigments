package Assignment3;
import java.util.*;

class Q4 {
    static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            }
 
            else if (nums[mid] < target){
                start = mid + 1;
            }
 
            else{
                end = mid - 1;
            }
        }
    return end + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target=sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}