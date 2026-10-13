import java.util.*;
abstract class Student { final String name; Student(String name){this.name=name;} abstract double tuition(); double extraFee(){return 0;} final double totalFee(){return tuition()+extraFee();} }
interface BusUser { double transportFee(); }
class DayScholar extends Student implements BusUser { DayScholar(String n){super(n);} double tuition(){return 40000;} public double transportFee(){return 12000;} double extraFee(){return transportFee();} }
class Hosteller extends Student { Hosteller(String n){super(n);} double tuition(){return 40000;} double extraFee(){return 60000;} }
class Scholar extends Student implements BusUser { Scholar(String n){super(n);} double tuition(){return 20000;} public double transportFee(){return 12000;} double extraFee(){return transportFee();} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String type=in.next().toUpperCase(),name=in.next();Student s;
            switch(type){case "DAY_SCHOLAR":s=new DayScholar(name);break;case "HOSTELLER":s=new Hosteller(name);break;case "SCHOLAR":s=new Scholar(name);break;default:throw new IllegalArgumentException("Unknown student type: "+type);}
            double fee=s.totalFee();total+=fee;System.out.printf("%s: %.2f%n",name,fee);
        }System.out.printf("Total Collected: %.2f%n",total);
    }
}
