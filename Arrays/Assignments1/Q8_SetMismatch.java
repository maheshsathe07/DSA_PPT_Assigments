import java.util.*;
import java.util.Map;

class Q8_SetMismatch{

    public static void answer(int [] arr){
        int sumArr = 0;
        int sumNum = arr.length*(arr.length+1)/2;
        for(int i :arr){
            sumArr +=i;
        }
        Map<Integer,Integer> freqmap = new  HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(freqmap.containsKey(arr[i])){
                System.out.print(arr[i]+", ");
                System.out.println(sumNum-sumArr+arr[i]);
                break;
            }
            freqmap.put(arr[i], 1);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i =0; i<n; i++){
            array[i] = sc.nextInt();
        }
        answer(array);
    }
}