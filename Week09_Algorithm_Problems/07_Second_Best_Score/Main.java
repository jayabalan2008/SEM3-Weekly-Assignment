import java.util.*;
public class Main {
    static int secondHighest(int[] scores){int highest=-1,second=-1;for(int score:scores){if(score>highest){second=highest;highest=score;}else if(score<highest&&score>second){second=score;}}return second;}
    // O(n) time and O(1) auxiliary space; sorting would take O(n log n) time.
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] scores=new int[n];for(int i=0;i<n;i++)scores[i]=sc.nextInt();System.out.println(secondHighest(scores));}
}
