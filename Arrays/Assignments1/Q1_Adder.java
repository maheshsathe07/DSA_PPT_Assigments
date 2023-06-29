import java.util.*;
class Q1_Adder {
	static void numsums(int arr[], int targetSum) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == targetSum) {
					System.out.println("(" + i + ", "+j + ")");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target sum : ");
		int targetSum = sc.nextInt();
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");
		for(int i=0; i<n; i++) {
			int el = sc.nextInt();
			arr[i] = el;
		}
//		Q1_Adder a = new Q1_Adder();
//		a.getData(arr);
		numsums(arr, targetSum);
	}
}
