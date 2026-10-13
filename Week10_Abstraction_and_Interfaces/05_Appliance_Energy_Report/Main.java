import java.util.*;
abstract class Appliance { final double hours; Appliance(double h){hours=h;} abstract double powerWatts(); double units(boolean saver){return powerWatts()*hours/1000.0*(saver?.75:1.0);} boolean supportsSaver(){return false;} }
interface SaverMode { }
class Fridge extends Appliance { Fridge(double h){super(h);} double powerWatts(){return 150;} }
class AirConditioner extends Appliance implements SaverMode { AirConditioner(double h){super(h);} double powerWatts(){return 1500;} boolean supportsSaver(){return true;} }
class Television extends Appliance { Television(double h){super(h);} double powerWatts(){return 100;} }
class Washer extends Appliance implements SaverMode { Washer(double h){super(h);} double powerWatts(){return 500;} boolean supportsSaver(){return true;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String type=in.next().toUpperCase();double hours=in.nextDouble();boolean saver=in.hasNext()&&in.hasNext("(?i)SAVER");if(saver)in.next();Appliance a;
            switch(type){case "FRIDGE":a=new Fridge(hours);break;case "AC":a=new AirConditioner(hours);break;case "TV":a=new Television(hours);break;case "WASHER":a=new Washer(hours);break;default:throw new IllegalArgumentException("Unknown appliance: "+type);}
            if(saver&&!a.supportsSaver()){System.out.println(type+": saver mode not supported");continue;}
            double units=a.units(saver),cost=units*8;total+=cost;System.out.printf("%s: Units=%.2f Cost=%.2f%n",type,units,cost);
        }System.out.printf("Total Cost: %.2f%n",total);
    }
}
