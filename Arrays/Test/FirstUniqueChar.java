import java.io.*;
import java.util.Scanner;
 
public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int index = -1;
        char fnc = ' ';
       
       if(string.length()==0){
         System.out.println("EMPTY STRING");
       }
       
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }
}
