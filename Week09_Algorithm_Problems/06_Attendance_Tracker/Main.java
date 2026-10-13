import java.util.*;
public class Main {
    static int[] attendanceSummary(int[] days){int present=0,best=0,run=0;for(int day:days){if(day==1){present++;run++;best=Math.max(best,run);}else run=0;}return new int[]{present,best};}
    // O(n) time, O(1) auxiliary space; both values are computed in one pass.
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] days=new int[n];for(int i=0;i<n;i++)days[i]=sc.nextInt();int[] result=attendanceSummary(days);System.out.println("Present: "+result[0]+", Longest streak: "+result[1]);}
}
