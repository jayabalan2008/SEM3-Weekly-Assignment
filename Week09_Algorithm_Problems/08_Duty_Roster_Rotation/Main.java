import java.util.*;
public class Main {
    static String[] rotateRoster(String[] names,long k){int n=names.length;String[] result=new String[n];if(n==0)return result;int shift=(int)(k%n);for(int i=0;i<n;i++)result[(i+shift)%n]=names[i];return result;}
    // O(n) time and O(n) additional space. k is reduced modulo n, so large k is efficient.
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();String[] names=new String[n];for(int i=0;i<n;i++)names[i]=sc.next();long k=sc.nextLong();System.out.println(Arrays.toString(rotateRoster(names,k)));}
}
