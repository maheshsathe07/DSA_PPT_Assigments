import java.util.*;
class Q6_ContainsDuplicate {
  static boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (final int num : nums)
      if (!seen.add(num))
        return true;

    return false;
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    n = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter elements of array: ");
    for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
    }
    System.out.println(containsDuplicate(nums));
  }
}
