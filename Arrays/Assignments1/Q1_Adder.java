import java.util.*;
public class Adder {
	int[] arr;
	int targetSum ;

	void getData(int[] arr) {
		this.arr = arr;
	}
	
	void numsums(int targetSum) {

		for(int i=0; i<this.arr.length; i++) {
			for(int j=i+1; j<this.arr.length; j++) {
				if(this.arr[i] + this.arr[j] == targetSum) {
					System.out.println("(" + i + ", "+j + ")");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");
		for(int i=0; i<n; i++) {
			int el = sc.nextInt();
			arr[i] = el;
		}
		Adder a = new Adder();
		a.getData(arr);
		System.out.println("Enter Target sum : ");
		int targetSum = sc.nextInt();
		a.numsums(targetSum);
	}
}
