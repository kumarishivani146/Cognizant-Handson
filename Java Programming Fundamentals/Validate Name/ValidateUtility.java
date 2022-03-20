import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String e_name=sc.nextLine();
        String p_name=sc.nextLine();
        Validate v=validateEmployeeName();
        if(v.validateName(e_name))
        System.out.println("Employee name is valid");
        else
        System.out.println("Employee name is invalid");
        v=validateProductName();
        if(v.validateName(p_name))
        System.out.println("Product name is valid");
        else
        System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        return s->{
            int num_char=0;
            for(int i=0;i<s.length();i++){
                int x=(int)s.charAt(i);
                if((x>=97&&x<=122)||(x>=65&&x<=90))
                num_char++;
                else if(s.charAt(i)==' ')
                continue;
                else
                return false;
            }
            if(num_char>=5&&num_char<=20)
            return true;
            return false;
        };
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        return s->{
            if(s.length()!=6||!Character.isAlphabetic(s.charAt(0)))
            return false;
            for(int i=1;i<s.length();i++){
                int x=(int)s.charAt(i);
                if(x>=48&&x<=57)
                continue;
                else
                return false;
            }
            return true;
        };
    }
}