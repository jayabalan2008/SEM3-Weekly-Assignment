import java.time.LocalDate;
import java.util.*;
interface Plan { int validityDays(); }
class BasicPlan implements Plan { public int validityDays(){return 30;} }
class StandardPlan implements Plan { public int validityDays(){return 90;} }
class PremiumPlan implements Plan { public int validityDays(){return 365;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();
        for(int i=0;i<n;i++){String type=in.next().toUpperCase(),name=in.next();LocalDate start=LocalDate.parse(in.next());Plan p;
            switch(type){case "BASIC":p=new BasicPlan();break;case "STANDARD":p=new StandardPlan();break;case "PREMIUM":p=new PremiumPlan();break;default:throw new IllegalArgumentException("Unknown plan: "+type);}
            System.out.println(name+": "+start.plusDays(p.validityDays()));
        }
    }
}
