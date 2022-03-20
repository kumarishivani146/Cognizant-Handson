import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try{
        Ticket t1=new Ticket();
        System.out.println("Enter no of bookings:");
        int no_ofbooking=sc.nextInt();
        System.out.println("Enter the available tickets:");
        t1.setAvailableTickets(sc.nextInt());
        
        while(no_ofbooking-->0){
            System.out.println("Enter the ticketid:");
            t1.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            t1.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int f=sc.nextInt();
            if(t1.calculateTicketCost(f)!=-1)
            System.out.println("Available tickets:"+t1.getAvailableTickets()+"\n"+"Total amount:"+t1.calculateTicketCost(f)+"\n"+"Available ticket after booking:"+t1.getAvailableTickets());
        }
    }catch(Exception e){
        return;
    }
    
  }
}