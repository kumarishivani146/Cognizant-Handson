import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
class Authority {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try{
        Pattern p = Pattern.compile("^[ A-Za-z]+$");
        
        System.out.println("Inmate's name:");
        String s1=sc.nextLine();
        Matcher m = p.matcher(s1);
        
        System.out.println("Inmate's father's name:");
        String s2=sc.nextLine();
        
        Matcher m1 = p.matcher(s2);
        if(!m.matches()||!m1.matches())
        {
            System.out.println("Invalid name");
            return;
        }
        String s3=s1+" "+s2;
        System.out.println(s3.toUpperCase());
    }catch(Exception e){
        return;
    }

  }
}