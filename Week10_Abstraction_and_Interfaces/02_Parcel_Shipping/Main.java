import java.util.*;
abstract class Parcel { final double weight,value; Parcel(double w,double v){weight=w;value=v;} abstract double charge(); double insurance(){return 0;} }
interface Insurable { double insurance(double declaredValue); }
class StandardParcel extends Parcel { StandardParcel(double w,double v){super(w,v);} double charge(){return 40+10*weight;} }
class ExpressParcel extends Parcel implements Insurable { ExpressParcel(double w,double v){super(w,v);} double charge(){return 80+15*weight;} public double insurance(double v){return v*.02;} double insurance(){return insurance(value);} }
class FragileParcel extends Parcel implements Insurable { FragileParcel(double w,double v){super(w,v);} double charge(){return 40+10*weight+50;} public double insurance(double v){return v*.02;} double insurance(){return insurance(value);} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double grand=0;
        for(int i=0;i<n;i++){String type=in.next().toUpperCase();double w=in.nextDouble(),v=in.nextDouble();Parcel p;
            switch(type){case "STANDARD":p=new StandardParcel(w,v);break;case "EXPRESS":p=new ExpressParcel(w,v);break;case "FRAGILE":p=new FragileParcel(w,v);break;default:throw new IllegalArgumentException("Unknown parcel: "+type);}
            double charge=p.charge(),insurance=p.insurance(),total=charge+insurance;grand+=total;System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",type,charge,insurance,total);
        }System.out.printf("Grand Total: %.2f%n",grand);
    }
}
