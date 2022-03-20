import java.util.*;
public class UserInterface {
   public static CommissionInfo generateCommissionObtained (){
       CommissionInfo c=(obj)->{
       String k=(String)obj.getClassType();
             if(k.equalsIgnoreCase("1A") || k.equalsIgnoreCase("2A") || k.equalsIgnoreCase("3A")){
                 return 100;
             }
            return 60;
        };
        return c;
   }
   public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of passengers");
    int n=sc.nextInt();
    Ticket t[]=new Ticket[n];
    for(int i=0;i<n;i++){
        System.out.println("Details of Passenger "+(i+1)+":");
        System.out.println("Enter the pnr no:");
        long p_no=sc.nextLong();
        System.out.println("Enter passenger name:");
        String name=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter seat no:");
        int seat_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter class type:");
        String c_type=sc.nextLine();
        System.out.println("Enter ticket fare:");
        double t_fare=sc.nextDouble();
        t[i]=new Ticket(p_no,name,seat_no,c_type,t_fare);
    }
    double sum=0;
    System.out.println("Commission Obtained");
         CommissionInfo o=generateCommissionObtained();
         for(int j=0;j<n;j++){
             sum+=o.calculateCommissionAmount(t[j]);
         }
         System.out.printf("Commission obtained per each person: Rs.%.2f",sum);
    } 
    
}