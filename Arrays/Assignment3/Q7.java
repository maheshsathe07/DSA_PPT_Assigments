package Assignment3;
import java.util.*;
class Q7 {
    static List<String> missingRanges(int[] nums) {
        List<String> s = new ArrayList();
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                s.add(Integer.toString(nums[i]));
                s.add(Integer.toString(nums[i]+1) +"->"+ Integer.toString(nums[i+1]-1));
            }
            else{
                s.add(Integer.toString(nums[i]));
            }
        }
        s.add(Integer.toString(nums[nums.length-1]));
        return s;
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
        System.out.println("Enter lower range:");
        int lower = sc.nextInt();
        System.out.println("Enter upper range:");
        int upper = sc.nextInt();
        System.out.println(missingRanges(nums));
    }
}