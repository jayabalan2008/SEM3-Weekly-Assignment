import java.util.*;
public class Main {
    // First index whose value is >= target; O(log n).
    static int lowerBound(int[] a,int target){int lo=0,hi=a.length;while(lo<hi){int mid=lo+(hi-lo)/2;if(a[mid]<target)lo=mid+1;else hi=mid;}return lo;}
    // First index whose value is > target; O(log n).
    static int upperBound(int[] a,int target){int lo=0,hi=a.length;while(lo<hi){int mid=lo+(hi-lo)/2;if(a[mid]<=target)lo=mid+1;else hi=mid;}return lo;}
    static int countInBand(int[] scores,int low,int high){return upperBound(scores,high)-lowerBound(scores,low);}
    // Scan: O(n) time, O(1) extra space. Binary-search solution: O(log n) time, O(1) extra space.
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int low=sc.nextInt(),high=sc.nextInt();System.out.println(countInBand(a,low,high));}
}
