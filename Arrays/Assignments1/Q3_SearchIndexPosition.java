import java.util.*;
import java.io.*;
class Q3_SearchIndexPosition {
     static int SearchIndex(int nums[], int target){
        int n=nums.length;
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end+1; 
    }
    public static void main(String[] args) {
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target");
        target=sc.nextInt();
        System.out.println("Enter Array Size");
		int n = sc.nextInt();
        int[] nums = new int[n];
		System.out.println("Enter Array Elements (in sorted order) :");
		for(int i=0; i<=n-1; i++) {
			nums[i] = sc.nextInt();
		}
        
        System.out.println(SearchIndex(nums,target));
    }
}
