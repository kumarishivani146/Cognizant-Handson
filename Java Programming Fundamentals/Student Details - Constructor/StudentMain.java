import java.util.Scanner;

public class StudentMain {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try{
        String cname="n";
        Student s;
        System.out.println("Enter Student's Id:");
        int id=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String sname=sc.nextLine();
        System.out.println("Enter Student's address:");
        String sddr=sc.nextLine();
        while(cname!="yes"||cname!="YES"||cname!="NO"||cname!="no")
        {
            System.out.println("Whether the student is from NIT(Yes/No):");
            cname=sc.nextLine();
            if(cname!="yes"||cname!="YES"||cname!="NO"||cname!="no")
            System.out.println("Wrong Input");
        }
        
        if(cname.equals("yes")||cname.equals("YES"))
        {
            s=new Student(id,sname,sddr);
            System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student name:"+s.getStudentName());
        System.out.println("Address:"+s.getStudentAddress());
        System.out.println("College name:"+s.getCollegeName());
        }
        else if(cname.equals("no")||cname.equals("NO")){
            System.out.println("Enter the college name:");
            cname=sc.nextLine();
            s=new Student(id,sname,sddr,cname);
            System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student name:"+s.getStudentName());
        System.out.println("Address:"+s.getStudentAddress());
        System.out.println("College name:"+s.getCollegeName());
        }
        
    }catch(Exception e){
        return;
    }
  }
}