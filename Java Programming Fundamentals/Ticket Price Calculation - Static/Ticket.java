public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public void setTicketid(int id){
        this.ticketid=id;
    }
    public int getTicketid(){
        return this.ticketid;
    }
    public void setPrice(int p){
        this.price=p;
    }
    public int getPrice(){
        return this.price;
    }
    public static void setAvailableTickets(int a){
        if(a>=0)
        availableTickets=a;
    } 
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets){
        if(availableTickets>=nooftickets&&availableTickets>0){
            availableTickets-=nooftickets;
            return nooftickets*this.price;
        }
        else
        return -1;
    }
}