// Question 4
// You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed 
// containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
// return true if n new flowers can be planted in the flowerbed without violating the 
// no-adjacent-flowers rule and false otherwise.

import java.util.Scanner;

class A2_Q4 {
    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;
            }

            if (n <= 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        m = sc.nextInt();
        int flowerbed[] = new int[m];
        System.out.println("Enter array elements:P");
        for(int i=0;i<m;i++){
            flowerbed[i] = sc.nextInt();
        }
        int n=0;
        System.out.println("Enter no. of new plants:");
        m = sc.nextInt();
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
