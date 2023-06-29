package Assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Q8 {
    static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] o) -> o[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no. of cols:");
        int c = sc.nextInt();
        System.out.println("Enter meeting intervals:");
        int[][] intervals = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                intervals[i][j]=sc.nextInt();
            }
        }
        System.out.println(canAttendMeetings(intervals));
    }
}