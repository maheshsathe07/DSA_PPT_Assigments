package Assignment5;
import java.util.*;
public class Q4 {
    static List<List<Integer>> differences(int nums1[], int nums2[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int x:nums1){
            map.put(x,1);
        }
        for(int x: nums2){
            if(map.getOrDefault(x,0) == 1){
                map.put(x,3);
            }
            if(map.getOrDefault(x,0)==0){
                map.put(x,2);
            }
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int x:nums1){
            if(map.getOrDefault(x,0)==1){
                map.put(x,0);
                l1.add(x);
            }
        }
        ans.add(l1);

        for(int x:nums2){
            if(map.getOrDefault(x,0)==2){
                l2.add(x);
            }
        }
        ans.add(l2);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums1:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of nums1:");
        int[] nums1 = new int[n1];
        for(int i=0; i<n1; i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter size of nums2:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of nums2:");
        int[] nums2 = new int[n2];
        for(int i=0; i<n2; i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println(differences(nums1,nums2));
    }
}
