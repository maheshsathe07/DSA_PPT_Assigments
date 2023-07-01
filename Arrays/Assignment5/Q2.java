package Assignment5;

import java.util.Scanner;

public class Q2 {
    static int arrangeCoins(int n){
        int ans=1;
        while(n>0){
            ans++;
            n = n - ans;
        }
        return ans-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of coins:");
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
}
