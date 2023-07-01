package Assignment5;

import java.util.*;

class Q8 {
    static int[] findOriginalArray(int[] changed) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();

        Arrays.sort(changed);

        for (final int num : changed)
            if (!q.isEmpty() && num == q.peek()) {
                q.poll();
            } else {
                q.offer(num * 2);
                ans.add(num);
            }

        return q.isEmpty() ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int changed[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            changed[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }
}
