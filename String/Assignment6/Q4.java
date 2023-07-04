package Assignment6;

import java.util.HashMap;
import java.util.Scanner;

class Q4 {
    static int findMaxLength(int[] nums) {
        int res = 0, sum = 0;
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        index.put(0, -1);
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                sum ++;
            }
            else {
                sum --;
            }
            if (index.containsKey(sum)) {
                res = Math.max(res, i - index.get(sum));
            } else {
                index.put(sum, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findMaxLength(nums));
    }
}