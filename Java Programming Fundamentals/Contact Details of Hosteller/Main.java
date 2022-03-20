import java.util.Scanner;
public class Main{
    public static Hosteller getHostellerDetails(){
        Hosteller s1=new Hosteller();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Student Id");
            s1.setStudentId(sc.nextInt());
            sc.nextLine();
            System.out.println("Student Name");
            s1.setName(sc.nextLine());
            System.out.println("Department Id");
            s1.setDepartmentId(sc.nextInt());
            sc.nextLine();
            System.out.println("Gender");
            s1.setGender(sc.nextLine());
            System.out.println("Phone Number");
            s1.setPhone(sc.nextLine());
            System.out.println("Hostel Name");
            s1.setHostelName(sc.nextLine());
            System.out.println("Room Number");
            s1.setRoomNumber(sc.nextInt());
            return s1;
        }catch(Exception e){
            return s1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the Details:");
            Hosteller h1=getHostellerDetails();
            char c;
            System.out.println("Modify Room Number(Y/N)");
            c=sc.next().charAt(0);
            if(c=='Y'){
                System.out.println("New Room Number");
                h1.setRoomNumber(sc.nextInt());
                sc.nextLine();
            }
            System.out.println("Modify Phone Number(Y/N)");
            c=sc.next().charAt(0);
            if(c=='Y'){
                System.out.println("New Phone Number");
                h1.setPhone(sc.nextLine());
            }
            System.out.println("The Student Details");
            System.out.println(h1.getStudentId()+" "+h1.getName()+" "+h1.getGender()+" "+h1.getPhone()+" "+h1.getHostelName()+" "+h1.getRoomNumber());
        }catch(Exception e){
            return;
        }
    }
}