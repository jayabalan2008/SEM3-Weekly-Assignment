import java.util.*;
interface Vehicle { double parkingCharge(int hours); }
class Bike implements Vehicle { public double parkingCharge(int h) { return 10.0*h; } }
class Car implements Vehicle { public double parkingCharge(int h) { return h<=0?0:30.0+20.0*(h-1); } }
class Truck implements Vehicle { public double parkingCharge(int h) { return Math.max(100.0,50.0*h); } }
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); int n=in.nextInt(); double total=0;
        for(int i=0;i<n;i++){String type=in.next().toUpperCase(); int h=in.nextInt(); Vehicle v;
            switch(type){case "BIKE":v=new Bike();break;case "CAR":v=new Car();break;case "TRUCK":v=new Truck();break;default:throw new IllegalArgumentException("Unknown vehicle: "+type);}
            double charge=v.parkingCharge(h);total+=charge;System.out.printf("%s: %.2f%n",type,charge);
        } System.out.printf("Total: %.2f%n",total);
    }
}
