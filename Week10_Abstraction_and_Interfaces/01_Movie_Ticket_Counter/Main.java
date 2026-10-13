import java.util.*;
abstract class Ticket { private static final double CONVENIENCE_FEE=20.0; abstract double seatPrice(); final double amount(int count){return count*(seatPrice()+CONVENIENCE_FEE);} }
class RegularTicket extends Ticket { double seatPrice(){return 150;} }
class PremiumTicket extends Ticket { double seatPrice(){return 250;} }
class ReclinerTicket extends Ticket { double seatPrice(){return 400;} }
public class Main {
    public static void main(String[] args){Scanner in=new Scanner(System.in);int n=in.nextInt();double total=0;
        for(int i=0;i<n;i++){String seat=in.next().toUpperCase();int count=in.nextInt();Ticket t;
            switch(seat){case "REGULAR":t=new RegularTicket();break;case "PREMIUM":t=new PremiumTicket();break;case "RECLINER":t=new ReclinerTicket();break;default:throw new IllegalArgumentException("Unknown seat: "+seat);}
            double amount=t.amount(count);total+=amount;System.out.printf("%s: %.2f%n",seat,amount);
        }System.out.printf("Total: %.2f%n",total);
    }
}
