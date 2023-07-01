package Assignment4;
import java.util.Arrays;
import java.util.Scanner;
class Q8 {
    static int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] res = new int[m];
        int c=m-n;
        int l = 0;
        for(int i=0; i<m; i+=2){
            res[i] = nums[l];
            res[i+1] = nums[c];
            c++;
            l+=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int m = sc.nextInt();

        int nums[] = new int[m];
        System.out.println("Enter array: ");
        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
}