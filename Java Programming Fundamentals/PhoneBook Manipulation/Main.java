
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
                while(true){
                
                System.out.println("Menu");
                System.out.println("1.Add Contact");
                System.out.println("2.Display all contacts");
                System.out.println("3.Search contact by phone ");
                System.out.println("4.Remove contact");
                System.out.println("5.Exit");
                System.out.println("Enter your choice:");
                PhoneBook p=new PhoneBook();
                p.setPhoneBook(new ArrayList<Contact>());
                int x=sc.nextInt();
                Contact c;
                List<Contact> l;
                if(x==1){
                    c=new Contact("","",0,"");
                    System.out.println("Enter the First Name: ");
                    c.setFirstName(sc.nextLine());
                    System.out.println("Enter the Last Name: ");
                    c.setLastName(sc.nextLine());
                    System.out.println("Enter the Phone No.: ");
                    c.setPhoneNumber(sc.nextLong());
                    sc.nextLine();
                    System.out.println("Enter the Email: ");
                    c.setEmailId(sc.nextLine());
                    p.addContact(c);
                }
                else if(x==2){
                    l=p.viewAllContacts();
                    for(int i=0;i<l.size();i++){
                        System.out.println("First Name: "+l.get(i).getFirstName());
                        System.out.println("Last Name: "+l.get(i).getLastName());
                        System.out.println("Phone No.: "+l.get(i).getPhoneNumber());
                        System.out.println("Email: "+l.get(i).getEmailId());
                    }
                }
                
            }
        }
        catch(Exception e){
            return;
        }
    }
}