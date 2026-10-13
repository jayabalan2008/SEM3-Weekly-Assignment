import java.util.*;
interface BillCustomer { double finalAmount(double amount); }
class Student implements BillCustomer { public double finalAmount(double a) { return a * 0.90; } }
class Staff implements BillCustomer { public double finalAmount(double a) { return a * 0.95; } }
class Guest implements BillCustomer { public double finalAmount(double a) { return a + 10; } }
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); int n = in.nextInt(); double total = 0;
        for (int i=0;i<n;i++) { String type=in.next().toUpperCase(); double amount=in.nextDouble(); BillCustomer c;
            switch(type) { case "STUDENT": c=new Student(); break; case "STAFF": c=new Staff(); break; case "GUEST": c=new Guest(); break; default: throw new IllegalArgumentException("Unknown customer: "+type); }
            double result=c.finalAmount(amount); total+=result; System.out.printf("%s: %.2f%n",type,result);
        }
        System.out.printf("Total: %.2f%n",total);
    }
}
