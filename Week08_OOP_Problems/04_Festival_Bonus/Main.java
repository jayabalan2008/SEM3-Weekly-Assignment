import java.util.*;
abstract class Employee { final String name; final double salary; Employee(String n,double s){name=n;salary=s;} abstract double bonus(); }
class FullTime extends Employee { FullTime(String n,double s){super(n,s);} double bonus(){return salary*.10;} }
class PartTime extends Employee { PartTime(String n,double s){super(n,s);} double bonus(){return salary*.05;} }
class Intern extends Employee { Intern(String n,double s){super(n,s);} double bonus(){return 2000;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=in.next().toUpperCase(),name=in.next();double s=in.nextDouble();Employee e;
            switch(t){case "FULLTIME":e=new FullTime(name,s);break;case "PARTTIME":e=new PartTime(name,s);break;case "INTERN":e=new Intern(name,s);break;default:throw new IllegalArgumentException("Unknown employee type: "+t);}
            double b=e.bonus();total+=b;System.out.printf("%s: %.2f%n",name,b);
        }System.out.printf("Total Bonus: %.2f%n",total);
    }
}
