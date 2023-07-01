package Assignment4;
import java.util.*;
public class Q5 {
    public int arrangeCoins(int n){
        int res=1;
        while(n>0){
            res++;
            n = n-res;
        }
        return res-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of coins:");
        int n = sc.nextInt();

        Q5 c = new Q5();
        System.out.println(c.arrangeCoins(n));
    }
}
