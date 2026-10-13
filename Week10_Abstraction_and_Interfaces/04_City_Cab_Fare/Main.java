import java.util.*;
abstract class Cab { private static final double MIN_FARE=100; abstract double ratePerKm(); final double baseFare(double km){return Math.max(MIN_FARE,km*ratePerKm());} }
interface NightService { double NIGHT_MULTIPLIER=1.20; }
class MiniCab extends Cab { double ratePerKm(){return 10;} }
class SedanCab extends Cab implements NightService { double ratePerKm(){return 14;} double fare(double km,boolean night){double f=baseFare(km);return night?f*NIGHT_MULTIPLIER:f;} }
class SuvCab extends Cab implements NightService { double ratePerKm(){return 18;} double fare(double km,boolean night){double f=baseFare(km);return night?f*NIGHT_MULTIPLIER:f;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String type=in.next().toUpperCase();double km=in.nextDouble();boolean night=in.next().equalsIgnoreCase("NIGHT");Cab cab;double fare;
            switch(type){case "MINI":cab=new MiniCab();if(night){System.out.println("MINI: night service not available");continue;}fare=cab.baseFare(km);break;
                case "SEDAN":SedanCab s=new SedanCab();fare=s.fare(km,night);break;case "SUV":SuvCab u=new SuvCab();fare=u.fare(km,night);break;default:throw new IllegalArgumentException("Unknown cab: "+type);}
            total+=fare;System.out.printf("%s: %.2f%n",type,fare);
        }System.out.printf("Total: %.2f%n",total);
    }
}
