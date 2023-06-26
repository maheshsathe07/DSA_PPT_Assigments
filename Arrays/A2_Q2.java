// Question 2
// Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 
// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 
// Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

import java.util.*;

public class A2_Q2 {
    static int distributeCandies(int[] C) {
        Set<Integer> cset = new HashSet<>();
        for (int c : C) cset.add(c);
        return Math.min(cset.size(), C.length / 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array of candies: ");
        n = sc.nextInt();
        int [] C = new int[n];
        System.out.println("Enter element of Candies array:");
        for(int i=0; i<n; i++){
            C[i] = sc.nextInt();
        }
        System.out.println(distributeCandies(C));


    }
} 