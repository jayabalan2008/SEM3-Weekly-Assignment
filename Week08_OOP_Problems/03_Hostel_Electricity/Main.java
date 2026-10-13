import java.util.*;
abstract class Room { final int units; Room(int units){this.units=units;} abstract double bill(); }
class SingleRoom extends Room { SingleRoom(int u){super(u);} double bill(){return units*8.0;} }
class SharedRoom extends Room { final int occupants; SharedRoom(int u,int o){super(u);occupants=o;} double bill(){if(occupants<=0)throw new IllegalArgumentException("occupants must be positive");return units*6.0/occupants;} }
class AcRoom extends Room { AcRoom(int u){super(u);} double bill(){return units*10.0+200;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=in.next().toUpperCase();int u=in.nextInt();Room r;
            switch(t){case "SINGLE":r=new SingleRoom(u);break;case "SHARED":r=new SharedRoom(u,in.nextInt());break;case "AC":r=new AcRoom(u);break;default:throw new IllegalArgumentException("Unknown room: "+t);}
            double b=r.bill();total+=b;System.out.printf("%s: %.2f%n",t,b);
        }System.out.printf("Total: %.2f%n",total);
    }
}
