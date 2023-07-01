package Assignment5;
import java.util.Scanner;
class Q5 {
    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        int r=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j])<=d){
                    r=1;
                    break;
                }
                else{
                    r=0;
                }
            }
            if(r==1){
                continue;
            }
            else if(r==0){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of arr11:");
            int n1 = sc.nextInt();
            System.out.println("Enter elements of arr1:");
            int[] arr1 = new int[n1];
            for(int i=0; i<n1; i++){
                arr1[i]=sc.nextInt();
            }
            System.out.println("Enter size of arr2:");
            int n2 = sc.nextInt();
            System.out.println("Enter elements of arr2:");
            int[] arr2 = new int[n2];
            for(int i=0; i<n2; i++){
                arr2[i]=sc.nextInt();
            }
            System.out.println("Enter threshold value:");
            int d = sc.nextInt();
            System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
}
