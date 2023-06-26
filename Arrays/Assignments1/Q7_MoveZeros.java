import java.util.*;
class Q7_MoveZeros{
    static void movezeros(int nums[]){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]!=0){
                nums[count++] = nums[i];
                // nums[count] = nums[i];
                // count++;
            }
        }
        while(count<n){
            nums[count++]=0;
            // nums[count] = 0;
            // count++;
        }
    }public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        System.out.println("Enter Elements of Array: ");
        int[] nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        movezeros(nums);
        System.out.println(Arrays.toString(nums));
    }

}